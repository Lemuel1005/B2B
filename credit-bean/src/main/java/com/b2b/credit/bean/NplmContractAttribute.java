package com.b2b.credit.bean;


import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class NplmContractAttribute implements Serializable {
  @Id
  @Column
  private long id;
  @Column
  private long loanContractId;
  @Column
  private long loanContractNum;
  @Column
  private String businessType;
  @Column
  private String isExpedited;
  @Column
  private String signDate;
  @Column
  private long signType;
  @Column
  private String approveDate;
  @Column
  private String firstRepayDate;
  @Column
  private long feeFlag;
  @Column
  private String interestFlag;
  @Column
  private long interestType;
  @Column
  private long graceDays;
  @Column
  private long irr;
  @Column
  private long lnsRate;
  @Column
  private String channelCode;
  @Column
  private String channelName;
  @Column
  private String loanOfficerId;
  @Column
  private String cityId;
  @Column
  private String city;
  @Column
  private String isModify;
  @Column
  private String isSchemeModify;
  @Column
  private long recycleWay;
  @Column
  private String isRecycleLoad;
  @Column
  private long recycleLoanCnt;
  @Column
  private String oldContractNum;
  @Column
  private long settleAmount;
  @Column
  private String newContractNum;
  @Column
  private String isShorten;
  @Column
  private String isExtend;
  @Column
  private String isChangeProduce;
  @Column
  private String isOverdue;
  @Column
  private String isPayAhead;
  @Column
  private String isPayPart;
  @Column
  private String purpose;
  @Column
  private String purposeSon;
  @Column
  private String purposeDetail;
  @Column
  private String isDivAccount;
  @Column
  private String systemType;
  @Column
  private String highRisk;
  @Column
  private String isBuyout;
  @Column
  private String feeProcessType;
  @Column
  private String studentCorpName;
  @Column
  private String settleDate;
  @Column
  private String habitTime;
  @Column
  private String repayDay;
  @Column
  private String applyId;
  @Column
  private String oldApplyId;
  @Column
  private String deptId;
  @Column
  private String deptName;
  @Column
  private String creator;
  @Column
  private java.sql.Timestamp createTime;
  @Column
  private String updater;
  @Column
  private java.sql.Timestamp updateTime;
  @Column
  private String updateType;
  @Column
  private long frontChargeDiscount;
  @Column
  private long monthMRate;
  @Column
  private long handleChargeRate;
  @Column
  private long loanTimes;
  @Column
  private String pawn;
  @Column
  private long handleCharge;
  @Column
  private long monthChargeDiscount;
  @Column
  private long guaranteeFee;
  @Column
  private String guaranteeCompany;
  @Column
  //贷款品种
  private String daikuanType;
  @Column
  //信托机构
  private String xintuoJigou;
  @Column
  //信托产品系列
  private String xintuoChanpin;
  @Column
  //信托计划
  private String xintuoJihua;
  @Column
  //合同变更金额
  private String htBiangengJier;
  @Column
  //放款时间
  private String fangkuanTime;

  public String getDaikuanType() {
    return daikuanType;
  }

  public void setDaikuanType(String daikuanType) {
    this.daikuanType = daikuanType;
  }

  public String getXintuoJigou() {
    return xintuoJigou;
  }

  public void setXintuoJigou(String xintuoJigou) {
    this.xintuoJigou = xintuoJigou;
  }

  public String getXintuoChanpin() {
    return xintuoChanpin;
  }

  public void setXintuoChanpin(String xintuoChanpin) {
    this.xintuoChanpin = xintuoChanpin;
  }

  public String getXintuoJihua() {
    return xintuoJihua;
  }

  public void setXintuoJihua(String xintuoJihua) {
    this.xintuoJihua = xintuoJihua;
  }

  public String getHtBiangengJier() {
    return htBiangengJier;
  }

  public void setHtBiangengJier(String htBiangengJier) {
    this.htBiangengJier = htBiangengJier;
  }

  public String getFangkuanTime() {
    return fangkuanTime;
  }

  public void setFangkuanTime(String fangkuanTime) {
    this.fangkuanTime = fangkuanTime;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getLoanContractId() {
    return loanContractId;
  }

  public void setLoanContractId(long loanContractId) {
    this.loanContractId = loanContractId;
  }


  public long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }


  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public String getIsExpedited() {
    return isExpedited;
  }

  public void setIsExpedited(String isExpedited) {
    this.isExpedited = isExpedited;
  }


  public String getSignDate() {
    return signDate;
  }

  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }


  public long getSignType() {
    return signType;
  }

  public void setSignType(long signType) {
    this.signType = signType;
  }


  public String getApproveDate() {
    return approveDate;
  }

  public void setApproveDate(String approveDate) {
    this.approveDate = approveDate;
  }


  public String getFirstRepayDate() {
    return firstRepayDate;
  }

  public void setFirstRepayDate(String firstRepayDate) {
    this.firstRepayDate = firstRepayDate;
  }


  public long getFeeFlag() {
    return feeFlag;
  }

  public void setFeeFlag(long feeFlag) {
    this.feeFlag = feeFlag;
  }


  public String getInterestFlag() {
    return interestFlag;
  }

  public void setInterestFlag(String interestFlag) {
    this.interestFlag = interestFlag;
  }


  public long getInterestType() {
    return interestType;
  }

  public void setInterestType(long interestType) {
    this.interestType = interestType;
  }


  public long getGraceDays() {
    return graceDays;
  }

  public void setGraceDays(long graceDays) {
    this.graceDays = graceDays;
  }


  public long getIrr() {
    return irr;
  }

  public void setIrr(long irr) {
    this.irr = irr;
  }


  public long getLnsRate() {
    return lnsRate;
  }

  public void setLnsRate(long lnsRate) {
    this.lnsRate = lnsRate;
  }


  public String getChannelCode() {
    return channelCode;
  }

  public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
  }


  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public String getLoanOfficerId() {
    return loanOfficerId;
  }

  public void setLoanOfficerId(String loanOfficerId) {
    this.loanOfficerId = loanOfficerId;
  }


  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getIsModify() {
    return isModify;
  }

  public void setIsModify(String isModify) {
    this.isModify = isModify;
  }


  public String getIsSchemeModify() {
    return isSchemeModify;
  }

  public void setIsSchemeModify(String isSchemeModify) {
    this.isSchemeModify = isSchemeModify;
  }


  public long getRecycleWay() {
    return recycleWay;
  }

  public void setRecycleWay(long recycleWay) {
    this.recycleWay = recycleWay;
  }


  public String getIsRecycleLoad() {
    return isRecycleLoad;
  }

  public void setIsRecycleLoad(String isRecycleLoad) {
    this.isRecycleLoad = isRecycleLoad;
  }


  public long getRecycleLoanCnt() {
    return recycleLoanCnt;
  }

  public void setRecycleLoanCnt(long recycleLoanCnt) {
    this.recycleLoanCnt = recycleLoanCnt;
  }


  public String getOldContractNum() {
    return oldContractNum;
  }

  public void setOldContractNum(String oldContractNum) {
    this.oldContractNum = oldContractNum;
  }


  public long getSettleAmount() {
    return settleAmount;
  }

  public void setSettleAmount(long settleAmount) {
    this.settleAmount = settleAmount;
  }


  public String getNewContractNum() {
    return newContractNum;
  }

  public void setNewContractNum(String newContractNum) {
    this.newContractNum = newContractNum;
  }


  public String getIsShorten() {
    return isShorten;
  }

  public void setIsShorten(String isShorten) {
    this.isShorten = isShorten;
  }


  public String getIsExtend() {
    return isExtend;
  }

  public void setIsExtend(String isExtend) {
    this.isExtend = isExtend;
  }


  public String getIsChangeProduce() {
    return isChangeProduce;
  }

  public void setIsChangeProduce(String isChangeProduce) {
    this.isChangeProduce = isChangeProduce;
  }


  public String getIsOverdue() {
    return isOverdue;
  }

  public void setIsOverdue(String isOverdue) {
    this.isOverdue = isOverdue;
  }


  public String getIsPayAhead() {
    return isPayAhead;
  }

  public void setIsPayAhead(String isPayAhead) {
    this.isPayAhead = isPayAhead;
  }


  public String getIsPayPart() {
    return isPayPart;
  }

  public void setIsPayPart(String isPayPart) {
    this.isPayPart = isPayPart;
  }


  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public String getPurposeSon() {
    return purposeSon;
  }

  public void setPurposeSon(String purposeSon) {
    this.purposeSon = purposeSon;
  }


  public String getPurposeDetail() {
    return purposeDetail;
  }

  public void setPurposeDetail(String purposeDetail) {
    this.purposeDetail = purposeDetail;
  }


  public String getIsDivAccount() {
    return isDivAccount;
  }

  public void setIsDivAccount(String isDivAccount) {
    this.isDivAccount = isDivAccount;
  }


  public String getSystemType() {
    return systemType;
  }

  public void setSystemType(String systemType) {
    this.systemType = systemType;
  }


  public String getHighRisk() {
    return highRisk;
  }

  public void setHighRisk(String highRisk) {
    this.highRisk = highRisk;
  }


  public String getIsBuyout() {
    return isBuyout;
  }

  public void setIsBuyout(String isBuyout) {
    this.isBuyout = isBuyout;
  }


  public String getFeeProcessType() {
    return feeProcessType;
  }

  public void setFeeProcessType(String feeProcessType) {
    this.feeProcessType = feeProcessType;
  }


  public String getStudentCorpName() {
    return studentCorpName;
  }

  public void setStudentCorpName(String studentCorpName) {
    this.studentCorpName = studentCorpName;
  }


  public String getSettleDate() {
    return settleDate;
  }

  public void setSettleDate(String settleDate) {
    this.settleDate = settleDate;
  }


  public String getHabitTime() {
    return habitTime;
  }

  public void setHabitTime(String habitTime) {
    this.habitTime = habitTime;
  }


  public String getRepayDay() {
    return repayDay;
  }

  public void setRepayDay(String repayDay) {
    this.repayDay = repayDay;
  }


  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public String getOldApplyId() {
    return oldApplyId;
  }

  public void setOldApplyId(String oldApplyId) {
    this.oldApplyId = oldApplyId;
  }


  public String getDeptId() {
    return deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }


  public long getFrontChargeDiscount() {
    return frontChargeDiscount;
  }

  public void setFrontChargeDiscount(long frontChargeDiscount) {
    this.frontChargeDiscount = frontChargeDiscount;
  }


  public long getMonthMRate() {
    return monthMRate;
  }

  public void setMonthMRate(long monthMRate) {
    this.monthMRate = monthMRate;
  }


  public long getHandleChargeRate() {
    return handleChargeRate;
  }

  public void setHandleChargeRate(long handleChargeRate) {
    this.handleChargeRate = handleChargeRate;
  }


  public long getLoanTimes() {
    return loanTimes;
  }

  public void setLoanTimes(long loanTimes) {
    this.loanTimes = loanTimes;
  }


  public String getPawn() {
    return pawn;
  }

  public void setPawn(String pawn) {
    this.pawn = pawn;
  }


  public long getHandleCharge() {
    return handleCharge;
  }

  public void setHandleCharge(long handleCharge) {
    this.handleCharge = handleCharge;
  }


  public long getMonthChargeDiscount() {
    return monthChargeDiscount;
  }

  public void setMonthChargeDiscount(long monthChargeDiscount) {
    this.monthChargeDiscount = monthChargeDiscount;
  }


  public long getGuaranteeFee() {
    return guaranteeFee;
  }

  public void setGuaranteeFee(long guaranteeFee) {
    this.guaranteeFee = guaranteeFee;
  }


  public String getGuaranteeCompany() {
    return guaranteeCompany;
  }

  public void setGuaranteeCompany(String guaranteeCompany) {
    this.guaranteeCompany = guaranteeCompany;
  }




}
