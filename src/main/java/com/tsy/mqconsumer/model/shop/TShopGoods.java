package com.tsy.mqconsumer.model.shop;

import java.io.Serializable;
import java.util.Date;

public class TShopGoods implements Serializable {
    private String goodsid;

    private String storeid;

    private String userid;

    private String goodsname;

    private String goodssubtitle;

    private Integer state;

    private Integer catalog1;

    private Integer catalog2;

    private Integer storecatalog1;

    private Integer storecatalog2;

    private String picture;

    private Integer brandid;

    private String brandname;

    private String keyword;

    private Byte goodsstate;

    private Boolean examine;

    private String guarantee;

    private String goodsdescribe;

    private Integer expresstemplateid;

    private Boolean isdiscount;

    private Boolean deleteflag;

    private Date createtime;

    private Date updatetime;

    private String goodsintroduce;

    private static final long serialVersionUID = 1L;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodssubtitle() {
        return goodssubtitle;
    }

    public void setGoodssubtitle(String goodssubtitle) {
        this.goodssubtitle = goodssubtitle == null ? null : goodssubtitle.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCatalog1() {
        return catalog1;
    }

    public void setCatalog1(Integer catalog1) {
        this.catalog1 = catalog1;
    }

    public Integer getCatalog2() {
        return catalog2;
    }

    public void setCatalog2(Integer catalog2) {
        this.catalog2 = catalog2;
    }

    public Integer getStorecatalog1() {
        return storecatalog1;
    }

    public void setStorecatalog1(Integer storecatalog1) {
        this.storecatalog1 = storecatalog1;
    }

    public Integer getStorecatalog2() {
        return storecatalog2;
    }

    public void setStorecatalog2(Integer storecatalog2) {
        this.storecatalog2 = storecatalog2;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Byte getGoodsstate() {
        return goodsstate;
    }

    public void setGoodsstate(Byte goodsstate) {
        this.goodsstate = goodsstate;
    }

    public Boolean getExamine() {
        return examine;
    }

    public void setExamine(Boolean examine) {
        this.examine = examine;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee == null ? null : guarantee.trim();
    }

    public String getGoodsdescribe() {
        return goodsdescribe;
    }

    public void setGoodsdescribe(String goodsdescribe) {
        this.goodsdescribe = goodsdescribe == null ? null : goodsdescribe.trim();
    }

    public Integer getExpresstemplateid() {
        return expresstemplateid;
    }

    public void setExpresstemplateid(Integer expresstemplateid) {
        this.expresstemplateid = expresstemplateid;
    }

    public Boolean getIsdiscount() {
        return isdiscount;
    }

    public void setIsdiscount(Boolean isdiscount) {
        this.isdiscount = isdiscount;
    }

    public Boolean getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getGoodsintroduce() {
        return goodsintroduce;
    }

    public void setGoodsintroduce(String goodsintroduce) {
        this.goodsintroduce = goodsintroduce == null ? null : goodsintroduce.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TShopGoods other = (TShopGoods) that;
        return (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getStoreid() == null ? other.getStoreid() == null : this.getStoreid().equals(other.getStoreid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getGoodssubtitle() == null ? other.getGoodssubtitle() == null : this.getGoodssubtitle().equals(other.getGoodssubtitle()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCatalog1() == null ? other.getCatalog1() == null : this.getCatalog1().equals(other.getCatalog1()))
            && (this.getCatalog2() == null ? other.getCatalog2() == null : this.getCatalog2().equals(other.getCatalog2()))
            && (this.getStorecatalog1() == null ? other.getStorecatalog1() == null : this.getStorecatalog1().equals(other.getStorecatalog1()))
            && (this.getStorecatalog2() == null ? other.getStorecatalog2() == null : this.getStorecatalog2().equals(other.getStorecatalog2()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getBrandname() == null ? other.getBrandname() == null : this.getBrandname().equals(other.getBrandname()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getGoodsstate() == null ? other.getGoodsstate() == null : this.getGoodsstate().equals(other.getGoodsstate()))
            && (this.getExamine() == null ? other.getExamine() == null : this.getExamine().equals(other.getExamine()))
            && (this.getGuarantee() == null ? other.getGuarantee() == null : this.getGuarantee().equals(other.getGuarantee()))
            && (this.getGoodsdescribe() == null ? other.getGoodsdescribe() == null : this.getGoodsdescribe().equals(other.getGoodsdescribe()))
            && (this.getExpresstemplateid() == null ? other.getExpresstemplateid() == null : this.getExpresstemplateid().equals(other.getExpresstemplateid()))
            && (this.getIsdiscount() == null ? other.getIsdiscount() == null : this.getIsdiscount().equals(other.getIsdiscount()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getGoodsintroduce() == null ? other.getGoodsintroduce() == null : this.getGoodsintroduce().equals(other.getGoodsintroduce()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getStoreid() == null) ? 0 : getStoreid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getGoodssubtitle() == null) ? 0 : getGoodssubtitle().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCatalog1() == null) ? 0 : getCatalog1().hashCode());
        result = prime * result + ((getCatalog2() == null) ? 0 : getCatalog2().hashCode());
        result = prime * result + ((getStorecatalog1() == null) ? 0 : getStorecatalog1().hashCode());
        result = prime * result + ((getStorecatalog2() == null) ? 0 : getStorecatalog2().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getBrandname() == null) ? 0 : getBrandname().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getGoodsstate() == null) ? 0 : getGoodsstate().hashCode());
        result = prime * result + ((getExamine() == null) ? 0 : getExamine().hashCode());
        result = prime * result + ((getGuarantee() == null) ? 0 : getGuarantee().hashCode());
        result = prime * result + ((getGoodsdescribe() == null) ? 0 : getGoodsdescribe().hashCode());
        result = prime * result + ((getExpresstemplateid() == null) ? 0 : getExpresstemplateid().hashCode());
        result = prime * result + ((getIsdiscount() == null) ? 0 : getIsdiscount().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getGoodsintroduce() == null) ? 0 : getGoodsintroduce().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsid=").append(goodsid);
        sb.append(", storeid=").append(storeid);
        sb.append(", userid=").append(userid);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", goodssubtitle=").append(goodssubtitle);
        sb.append(", state=").append(state);
        sb.append(", catalog1=").append(catalog1);
        sb.append(", catalog2=").append(catalog2);
        sb.append(", storecatalog1=").append(storecatalog1);
        sb.append(", storecatalog2=").append(storecatalog2);
        sb.append(", picture=").append(picture);
        sb.append(", brandid=").append(brandid);
        sb.append(", brandname=").append(brandname);
        sb.append(", keyword=").append(keyword);
        sb.append(", goodsstate=").append(goodsstate);
        sb.append(", examine=").append(examine);
        sb.append(", guarantee=").append(guarantee);
        sb.append(", goodsdescribe=").append(goodsdescribe);
        sb.append(", expresstemplateid=").append(expresstemplateid);
        sb.append(", isdiscount=").append(isdiscount);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", goodsintroduce=").append(goodsintroduce);
        sb.append("]");
        return sb.toString();
    }
}