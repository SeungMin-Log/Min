package min.crud.service.impl;

import min.crud.service.CrudService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("crudService")
public class CrudServiceImpl implements CrudService {

    @Resource(name = "crudMapper")
    private CrudMapper mapper;

    @Override
    public int count() {
        return mapper.count();
    }
}
