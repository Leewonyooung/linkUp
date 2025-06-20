package com.example.linkup.service.admin;

import com.example.linkup.dao.admin.IFreelancerDAO;
import com.example.linkup.dao.freelancer.CareerDAO;
import com.example.linkup.dto.AdminFreelancer;
import com.example.linkup.dto.Career;
import com.example.linkup.dto.Freelancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreelancerService implements IFreelancerService {

    private final IFreelancerDAO freelancerDAO;
    CareerDAO careerDAO = new CareerDAO();

    @Autowired
    public FreelancerService(IFreelancerDAO freelancerDAO) {
        this.freelancerDAO = freelancerDAO;
    }

    @Override
    public List<Freelancer> selectAllFreelancer() throws Exception {
        return freelancerDAO.selectAllFreelancer();
    }

    @Override
    public List<Freelancer> searchFreelancersByKeyword(String keyword) throws Exception {
        return freelancerDAO.searchFreelancersByKeyword(keyword);
    }

    @Override
    public AdminFreelancer selectFreelancerById(String freelancerId) throws Exception {
        return freelancerDAO.selectFreelancerById(freelancerId);
    }

    public List<Career> selectCareerListByFreelancerId(String freelancerId) throws Exception {
        System.out.println("FreelancerId : " + freelancerId);
        List<Career> careerList = careerDAO.selectCareerListByFreelancerId(freelancerId);
        for (Career career : careerList) {
            System.out.println("Career : " + career);
        }
        return careerList;
    }

}
