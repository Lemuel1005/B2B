package com.b2b.credit.manageweb.controller;

import com.b2b.credit.bean.NplmBorrowerInfo;
import com.b2b.credit.bean.NplmContractAttribute;
import com.b2b.credit.bean.NplmLoanContract;


import com.b2b.credit.manageweb.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ManageController {

    @Autowired
    ManageService manageService;

    @RequestMapping("smp")
    public String index(){
        return "smp";
    }


    @RequestMapping("contractList")
    public String list() {




        return "contractList";
    }

    @RequestMapping("getcontractList")
    @ResponseBody
    public Map<String, Object> getcontractList(@RequestParam Map<String,Object> param){
        String page = (String) param.get("page");
        String rows = (String) param.get("rows");
        //页码
        int pageNo = Integer.valueOf(page);
        //每页显示多少
        int pageSize = Integer.valueOf(rows);
        //从第几条开始查询
        int pageIndex = (pageNo-1)*pageSize;
        List<NplmLoanContract> nplmLoanContractList = manageService.getcontractList(pageIndex,pageSize);

        int total = manageService.getcount();

        Map<String,Object> map = new HashMap<>();

        map.put("total",total);
        map.put("rows",nplmLoanContractList);

        return map;
    }


    @RequestMapping("query")
    @ResponseBody
    public Map<String, Object> query(NplmLoanContract nplmLoanContract,@RequestParam Map<String,Object> param){
        String page = (String) param.get("page");
        String rows = (String) param.get("rows");

        int pageNo = Integer.valueOf(page);
        int pageSize = Integer.valueOf(rows);
        int pageIndex = (pageNo-1)*pageSize;

        List<NplmLoanContract> nplmLoanContractList = manageService.querycontractList(nplmLoanContract, pageIndex, pageSize);
        int total = manageService.getquerycount(nplmLoanContract);
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        map.put("rows",nplmLoanContractList);

        return map;
    }




}
