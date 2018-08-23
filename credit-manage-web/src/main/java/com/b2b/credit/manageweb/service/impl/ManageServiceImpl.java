package com.b2b.credit.manageweb.service.impl;

import com.b2b.credit.bean.NplmLoanContract;
import com.b2b.credit.manageweb.mapper.NplmLoanContractMapper;
import com.b2b.credit.manageweb.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    NplmLoanContractMapper nplmLoanContractMapper;

    @Override
    public List<NplmLoanContract> getcontractList(int pageIndex, int pageSize) {
        List<NplmLoanContract> nplmLoanContractList = nplmLoanContractMapper.selectNplmLoanContract(pageIndex,pageSize);

        return nplmLoanContractList;
    }



    @Override
    public List<NplmLoanContract> querycontractList(NplmLoanContract nplmLoanContract, int pageIndex, int pageSize) {
        List<NplmLoanContract> querycontractList = nplmLoanContractMapper.querycontractList(nplmLoanContract,pageIndex,pageSize);
        return querycontractList;
    }

    @Override
    public int getcount() {
        int total = nplmLoanContractMapper.querycount();
        return total;
    }

    @Override
    public int getquerycount(NplmLoanContract nplmLoanContract) {
        int queryTotal = nplmLoanContractMapper.getquerycount(nplmLoanContract);
        return queryTotal;
    }
}
