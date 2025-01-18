package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIgnoreContentTypeTest {

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        boolean ignoreContentType = true;
        Assert.assertEquals(ignoreContentType, httpConnection.ignoreContentType(ignoreContentType).request().ignoreContentType());
    }

}