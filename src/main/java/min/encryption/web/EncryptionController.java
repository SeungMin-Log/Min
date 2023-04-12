package min.encryption.web;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.registry.AlgorithmRegistry;
import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

/* DataSource 암호화를 위해 사용한 모듈 */
public class EncryptionController {
    public static void main(String[] args){

        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();

        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword("hashKey");

        String url = pbeEnc.encrypt("jdbc:mariadb://localhost:3306/min");
        String username = pbeEnc.encrypt("root");
        String password = pbeEnc.encrypt("root");
        String hashKey = pbeEnc.encrypt("hashKey");

        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        System.out.println(hashKey);
    }
}
