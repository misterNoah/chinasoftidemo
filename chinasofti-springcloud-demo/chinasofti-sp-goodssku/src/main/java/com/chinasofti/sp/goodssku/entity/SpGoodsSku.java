package com.chinasofti.sp.goodssku.entity;

import java.math.BigDecimal;

public class SpGoodsSku {
    private String ids;

    private String goodsId;

    private String skuCode;

    private BigDecimal skuSalePrice;

    private BigDecimal skuMarketPrice;

    private BigDecimal skuCostPrice;

    private String skuOptionIds;

    private String skuOptionNames;

    private Integer skuStock;

    private Integer skuSales;

    private String createUser;

    private String createTime;

    private String modifyUser;

    private String modifyTime;

    private String deleteStatus;

    private String creater;

    private String modifier;

    private String myskuCode;

    private String title;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public BigDecimal getSkuSalePrice() {
        return skuSalePrice;
    }

    public void setSkuSalePrice(BigDecimal skuSalePrice) {
        this.skuSalePrice = skuSalePrice;
    }

    public BigDecimal getSkuMarketPrice() {
        return skuMarketPrice;
    }

    public void setSkuMarketPrice(BigDecimal skuMarketPrice) {
        this.skuMarketPrice = skuMarketPrice;
    }

    public BigDecimal getSkuCostPrice() {
        return skuCostPrice;
    }

    public void setSkuCostPrice(BigDecimal skuCostPrice) {
        this.skuCostPrice = skuCostPrice;
    }

    public String getSkuOptionIds() {
        return skuOptionIds;
    }

    public void setSkuOptionIds(String skuOptionIds) {
        this.skuOptionIds = skuOptionIds == null ? null : skuOptionIds.trim();
    }

    public String getSkuOptionNames() {
        return skuOptionNames;
    }

    public void setSkuOptionNames(String skuOptionNames) {
        this.skuOptionNames = skuOptionNames == null ? null : skuOptionNames.trim();
    }

    public Integer getSkuStock() {
        return skuStock;
    }

    public void setSkuStock(Integer skuStock) {
        this.skuStock = skuStock;
    }

    public Integer getSkuSales() {
        return skuSales;
    }

    public void setSkuSales(Integer skuSales) {
        this.skuSales = skuSales;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus == null ? null : deleteStatus.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getMyskuCode() {
        return myskuCode;
    }

    public void setMyskuCode(String myskuCode) {
        this.myskuCode = myskuCode == null ? null : myskuCode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}