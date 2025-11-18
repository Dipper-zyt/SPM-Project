package com.ggams.asset.model;
import java.util.Date;
/**
 * 物资实体类
 */
public class Asset {
    private Long id;
    private String assetCode;
    private String assetName;
    private Integer assetType;
    private Integer status;
    private Date createTime;

    public Asset(String assetCode, String assetName, Integer assetType) {
        this.assetCode = assetCode;
        this.assetName = assetName;
        this.assetType = assetType;
        this.createTime = new Date();
    }

    // getter/setter
    public String getAssetCode() { return assetCode; }
    public void setAssetCode(String assetCode) { this.assetCode = assetCode; }

    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }

    public Integer getAssetType() { return assetType; }
    public void setAssetType(Integer assetType) { this.assetType = assetType; }
}