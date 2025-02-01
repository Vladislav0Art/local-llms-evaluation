package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedUrlBuilderURLNotNullTest {

    @Test
    public void UrlBuilderURLNotNullTest() throws Exception {
        String query = "sampleQuery";
        URL url = new URL("http://sampledomain.com?sampleQuery");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(query, urlBuilder.q.toString());
    }

}