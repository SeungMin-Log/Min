package min.batch.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@Controller
public class BatchController {

    /* 간단한 배치파일 실행시키는 모듈 */
    @RequestMapping(value = "/batch.do")
    public void batch(){
        try {
            // 배치 파일 경로 지정
            String batchFilePath = "C:\\Users\\USER\\Desktop\\example.bat";

            // Runtime 클래스로 명령어 실행
            Process process = Runtime.getRuntime().exec(batchFilePath);

            // 명령어 실행 결과 출력
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // 프로세스 종료 대기
            process.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
