package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestUrlDecoded {

    @Test
    public void testUrlDecoded() throws Exception {
        String url = "http://example.com/path%20with%20spaces";
        URL urlObj = new URL(url);
        UrlBuilder builder = new UrlBuilder(urlObj);
        URL result = builder.build();
        Assert.assertEquals("http://example.com/path with spaces", URLUtil.toString(result));
    }

}