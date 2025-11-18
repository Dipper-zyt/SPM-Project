package com.ggams.asset.service;
import com.ggams.asset.model.Asset;
import com.ggams.asset.model.AssetDTO;
import com.ggams.asset.model.Result;
/**
 * 物资管理服务类
 */
public class AssetService {
    // 物资入库
    public Result<String> assetIn(AssetDTO assetDTO) {
        if (assetDTO.getAssetName() == null || assetDTO.getAssetName().trim().isEmpty()) {
            return Result.error("物资名称不能为空");
        }

        String assetCode = "ASSET_" + System.currentTimeMillis();
        Asset asset = new Asset(assetCode, assetDTO.getAssetName(), assetDTO.getAssetType());

        // 保存
        System.out.println("保存物资: " + asset.getAssetName());
        return Result.success("物资入库成功", assetCode);
    }

    // 物资查询
    public Result<Asset> findAsset(String assetCode) {
        Asset asset = new Asset(assetCode, "模拟物资", 1);
        return Result.success("查询成功", asset);
    }
}