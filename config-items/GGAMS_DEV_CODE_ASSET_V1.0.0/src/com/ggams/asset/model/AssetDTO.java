package com.ggams.asset.model;
/**
 * 物资数据传输对象
 */
public class AssetDTO {
    private String assetName;
    private Integer assetType;
    private String sourceDepartment;
    // getter/setter
    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }

    public Integer getAssetType() { return assetType; }
    public void setAssetType(Integer assetType) { this.assetType = assetType; }

    public String getSourceDepartment() { return sourceDepartment; }
    public void setSourceDepartment(String sourceDepartment) { this.sourceDepartment = sourceDepartment; }
}