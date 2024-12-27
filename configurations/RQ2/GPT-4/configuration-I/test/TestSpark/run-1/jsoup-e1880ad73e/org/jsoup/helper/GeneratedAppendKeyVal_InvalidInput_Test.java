package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyVal_InvalidInput_Test {

    @Test
    public void appendKeyVal_InvalidInput_Test() throws Exception {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "this is not valid", false);
        builder.appendKeyVal(keyVal);
    }

}