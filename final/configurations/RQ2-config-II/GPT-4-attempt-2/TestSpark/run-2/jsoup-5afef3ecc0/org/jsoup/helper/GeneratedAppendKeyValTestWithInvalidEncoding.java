package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTestWithInvalidEncoding {

    @Test
    public void appendKeyValTestWithInvalidEncoding() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        //Create key value pair with invalid encoding characters
        Connection.KeyVal kv = Connection.KeyVal.create("key", "valu\uFFFFe");
        urlBuilder.appendKeyVal(kv);
    }

}