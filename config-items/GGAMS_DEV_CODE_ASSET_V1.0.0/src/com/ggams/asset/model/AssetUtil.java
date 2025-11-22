package com.ggams.asset.model;

public class AssetUtil {

    public static String generateAssetCode(String type) {
        return type + "_" + System.currentTimeMillis();
    }

    public static boolean isValidStatus(String status) {
        return "AVAILABLE".equals(status) ||
                "IN_USE".equals(status) ||
                "MAINTENANCE".equals(status);
    }
}