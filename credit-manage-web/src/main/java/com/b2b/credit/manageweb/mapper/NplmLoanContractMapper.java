package com.b2b.credit.manageweb.mapper;

import com.b2b.credit.bean.NplmLoanContract;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {

    List<NplmLoanContract> selectNplmLoanContract(int pageIndex,int pageSize);

    List<NplmLoanContract> querycontractList(@Param("nplmLoanContract")NplmLoanContract nplmLoanContract, @Param("pageIndex")int pageIndex, @Param("pageSize")int pageSize);

    int querycount();

    int getquerycount(@Param("nplmLoanContract")NplmLoanContract nplmLoanContract);
}
