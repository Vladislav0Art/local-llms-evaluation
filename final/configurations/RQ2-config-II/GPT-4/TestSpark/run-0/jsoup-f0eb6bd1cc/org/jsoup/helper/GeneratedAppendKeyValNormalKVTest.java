package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsx.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNormalKVTest {

    // assuming constructor and build method correctness will be ensured by other methods

    @Test
    public void appendKeyValNormalKVTest() {
        try {
            URL testUrl = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(testUrl);
            Connection.KeyVal testKV = new Connection.KeyVal("test", "value");
            urlBuilder.appendKeyVal(testKV);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals("http://test.com?test=value", resultUrl.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

}