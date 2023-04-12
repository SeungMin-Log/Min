package min.crud.service.impl;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("crudMapper")
public interface CrudMapper {

    public int count();

}
