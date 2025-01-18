package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildAfterAppendingKeyValTest {

    @Test
    public void buildAfterAppendingKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            Assert.assertNotNull(urlBuilder);
            urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
            URL resultUrl = urlBuilder.build();
            Assert.assertNotEquals(url, resultUrl);
        } catch (Exception e) {
            Assert.fail();
        }
    }

}