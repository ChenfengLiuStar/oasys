package com.oasys.oalcfdemoservice.dao;

import com.oasys.oaapi.entity.Demo;
import com.oasys.oalcfdemocommon.base.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends BaseDao<Demo> {
}
