package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedBuildInvalidUrlTest {

    private static final String UTF_8 = DataUtil.UTF_8;

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key1", "val1"));
        builder.build();
    }

}