package com.gffny.test.utils;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by John D. Gaffney | Isobar US
 * 8/7/16
 */
public class TestUtils {

    public static String buildResourcePath(String resourcePath, String extension, String... selectorArray) {
        String builtResourcePath = resourcePath;
        if(ArrayUtils.isNotEmpty(selectorArray)) {
            for (String selector : selectorArray) {
                builtResourcePath = selector != null ? builtResourcePath.concat(selector) : builtResourcePath;
            }
        }
        return extension != null ? builtResourcePath.concat(extension) : builtResourcePath;
    }
}
