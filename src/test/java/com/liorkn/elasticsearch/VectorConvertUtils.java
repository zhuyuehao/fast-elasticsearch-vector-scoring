package com.liorkn.elasticsearch;

import java.util.Arrays;

/**
 * @ClassName VectorConvertUtils
 * @Description 向量格式转换
 * @Author wang.ankun
 * @Date 2019/4/29 14:31
 * @Version 1.0
 **/
public class VectorConvertUtils {
    /**
     * 向量数据格式转换
     *
     * @param feature
     * @return
     */
    public static String[] getFeature(String feature) {
        feature = feature.replace("[", "").replace("]", "").replaceAll("\n", "");
        String[] split = feature.split(" ");
        String[] result = new String[split.length];
        if (split.length > 0) {
            int j = 0;
            for (int i = 0, len = split.length; i < len; i++) {
                String temp = split[i];
                if ("".equals(temp)) {
                    continue;
                }
                result[j] = split[i];
                j++;
            }
            result = Arrays.copyOf(result, j);
        }
        return result;
    }

    /**
     * 向量数据格式转换
     *
     * @param feature
     * @return
     */
    public static Double[] getFeatureDouble(String feature) {
        feature = feature.replace("[", "").replace("]", "").replaceAll("\n", "");
        String[] split = feature.split(" ");
        Double[] result = new Double[split.length];
        if (split.length > 0) {
            int j = 0;
            for (int i = 0, len = split.length; i < len; i++) {
                String temp = split[i];
                if ("".equals(temp)) {
                    continue;
                }
                result[j] = Double.valueOf(split[i]);
                j++;
            }
            result = Arrays.copyOf(result, j);
        }
        return result;
    }

    /**
     * 向量数据格式转换
     *
     * @param feature
     * @return
     */
    public static float[] getFeatureFloat(String feature) {
        feature = feature.replace("[", "").replace("]", "").replaceAll("\n", "");
        String[] split = feature.split(" ");
        float[] result = new float[split.length];
        if (split.length > 0) {
            int j = 0;
            for (int i = 0, len = split.length; i < len; i++) {
                String temp = split[i];
                if ("".equals(temp)) {
                    continue;
                }
                result[j] = Float.parseFloat(split[i]);
                j++;
            }
            result = Arrays.copyOf(result, j);
        }
        return result;
    }
}