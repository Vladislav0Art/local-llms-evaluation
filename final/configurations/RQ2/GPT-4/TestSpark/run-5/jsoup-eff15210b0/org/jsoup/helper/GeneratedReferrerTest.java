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

public class GeneratedReferrerTest {

    @Test
    public void referrerTest() {
        HttpConnection httpConnection = new HttpConnection();
        String referrer = "https://referrerwebsite.com";
        Assert.assertEquals(referrer, httpConnection.referrer(referrer).request().referrer());
    }

}