package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest_UnsupportedEncodingException {

    @Test
    public void appendKeyValTest_UnsupportedEncodingException() throws Exception {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        urlBuilder.appendKeyVal(kv);
    }

}