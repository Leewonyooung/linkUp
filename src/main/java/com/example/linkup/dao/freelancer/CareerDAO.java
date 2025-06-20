package com.example.linkup.dao.freelancer;

import com.example.linkup.dto.Career;
import org.apache.ibatis.session.SqlSession;
import com.example.linkup.util.MybatisSqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CareerDAO implements ICareerDAO{
    private SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();

    @Override
    public List<Career> selectCareerById(String freelancerId) throws Exception {
        return sqlSession.selectList("mapper.freelancer.selectCareerListById", freelancerId);
    }

    @Override
    public void insertCareer(Career career) throws Exception {

    }

    @Override
    public void updateCareer(Career career) throws Exception {

    }

    @Override
    public void deleteCareer(Integer num) throws Exception {

    }

    @Override
    public List<Career> selectCareerListByFreelancerId(String freelancerId) throws Exception {
        return sqlSession.selectList("mapper.career.selectCareerListByFreelancerId", freelancerId);
    }
}
