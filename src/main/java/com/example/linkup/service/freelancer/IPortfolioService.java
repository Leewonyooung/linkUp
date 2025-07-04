package com.example.linkup.service.freelancer;

import com.example.linkup.dto.Portfolio;
import com.example.linkup.util.PageInfo;

import java.util.List;
import java.util.Map;

public interface IPortfolioService {
    Portfolio selectPortfolioById(Integer num) throws Exception;
    Integer selectPortfolioCnt(String userId) throws Exception;
    List<Portfolio> selectPortfolioListByPage(PageInfo page_info, String user_id) throws Exception;
    void modifyPortfolio(Portfolio portfolio) throws Exception;
    void deletePortfolio(Integer num) throws Exception;
    Integer writePortfolio(Portfolio Portfolio) throws Exception;
    Map<Integer, String> projectInfoForPortfolio(String userId) throws Exception;
    public boolean isPortfolioOwner (String userId, Integer portfolioId) throws Exception;
}
