package com.ptit.filmdictionary.utils;

public class StringUtils {
    public static String getSmallImage(String image_path) {
        StringBuilder builder = new StringBuilder();
        builder.append(Constants.BASE_IMAGE_PATH)
                .append(Constants.IMAGE_SIZE_W200)
                .append(image_path);
        return builder.toString();
    }
}