package com.b2b.credit.manageweb.service;

import com.b2b.credit.bean.NplmLoanContract;

import java.util.List;

public interface ManageService {


    List<NplmLoanContract> getcontractList(int pageIndex, int pageSize);

    List<NplmLoanContract> querycontractList(NplmLoanContract nplmLoanContract, int pageIndex, int pageSize);

    int getcount();

    int getquerycount(NplmLoanContract nplmLoanContract);
}
