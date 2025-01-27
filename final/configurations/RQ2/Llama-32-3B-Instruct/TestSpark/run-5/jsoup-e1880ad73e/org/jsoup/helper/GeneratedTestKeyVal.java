package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestKeyVal {

    @Test
    public void testKeyVal() {
        KeyVal keyVal = new KeyVal("key", "value");
        StringUtil.KeyVal substr = new StringUtil.KeyVal(keyVal.key, keyVal.value);
        Assert.assertTrue(StringUtil.contains(substr.toString(), String.format("%s=%s", keyVal.key, keyVal.value)));
    }

}