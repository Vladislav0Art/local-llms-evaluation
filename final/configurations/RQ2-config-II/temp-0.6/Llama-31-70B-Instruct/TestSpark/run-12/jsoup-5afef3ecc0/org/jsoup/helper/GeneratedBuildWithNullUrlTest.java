package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedBuildWithNullUrlTest {

    @Test
    public void buildWithNullUrlTest() throws URISyntaxException {
        URL nullUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(nullUrl);
        URL builtUrl = urlBuilder.build();
        Assert.assertNull(builtUrl);
    }

}