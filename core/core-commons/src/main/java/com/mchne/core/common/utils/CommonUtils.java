package com.mchne.core.common.utils;

import java.util.Collection;

public class CommonUtils {

    public static boolean isSet(Object obj) {
        if (obj == null)
        {
            return false;
        }

        if (obj instanceof Collection<?>) {
            return obj != null && !((Collection<?>) obj).isEmpty();
        }
        if (obj instanceof String) {
            return obj != null && ((String) obj).length() > 0;
        }
        return obj.toString().length() > 0;
    }
}
