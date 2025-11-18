package com.ggams.asset.service;
import com.ggams.asset.model.Asset;
/**
 * 物资数据访问接口
 */
public interface AssetRepository {
    void save(Asset asset);
    Asset findByAssetCode(String assetCode);
}