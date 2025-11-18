package com.ggams.asset.service;
import com.ggams.asset.model.AssetDTO;
import com.ggams.asset.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * 物资管理服务测试类
 */
class AssetServiceTest {
    @Test
    void testAssetIn_Success() {
        AssetService service = new AssetService();
        AssetDTO assetDTO = new AssetDTO();
        assetDTO.setAssetName("测试物资");
        assetDTO.setAssetType(1);

        Result<String> result = service.assetIn(assetDTO);

        assertTrue(result.isSuccess());
        assertNotNull(result.getData());
    }
    @Test
    void testAssetIn_EmptyName() {
        AssetService service = new AssetService();
        AssetDTO assetDTO = new AssetDTO();
        assetDTO.setAssetName("");
        assetDTO.setAssetType(1);

        Result<String> result = service.assetIn(assetDTO);

        assertFalse(result.isSuccess());
        assertEquals("物资名称不能为空", result.getMessage());
    }
}