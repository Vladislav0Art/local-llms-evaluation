package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsx.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValEmptyStringTest {

    // assuming constructor and build method correctness will be ensured by other methods

    @Test
    public void appendKeyValEmptyStringTest() {
        try {
            URL testUrl = new URL("http://test.com");
            UrlBuilder urlBuilder = new UrlBuilder(testUrl);
            Connection.KeyVal testKV = new Connection.KeyVal("", "");
            urlBuilder.appendKeyVal(testKV);
            URL resultUrl = urlBuilder.build();
            Assert.assertEquals("http://test.com", resultUrl.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

}