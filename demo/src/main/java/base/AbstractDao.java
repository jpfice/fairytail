package base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractDao{

    @Autowired
    public SqlSessionFactory sqlSessionFactory = null;


}
