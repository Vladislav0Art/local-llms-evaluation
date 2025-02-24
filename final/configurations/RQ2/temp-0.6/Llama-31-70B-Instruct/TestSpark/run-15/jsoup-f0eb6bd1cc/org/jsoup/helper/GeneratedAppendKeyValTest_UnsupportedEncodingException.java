package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedAppendKeyValTest_UnsupportedEncodingException {

    @Test
    public void appendKeyValTest_UnsupportedEncodingException() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value", false);
        urlBuilder.appendKeyVal(kv);
        DataUtil.UTF_8 = null;
        urlBuilder.appendKeyVal(kv);
    }

}