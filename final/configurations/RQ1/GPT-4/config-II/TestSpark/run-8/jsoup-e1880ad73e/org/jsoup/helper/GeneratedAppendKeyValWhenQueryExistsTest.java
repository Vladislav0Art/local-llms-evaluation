package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendKeyValWhenQueryExistsTest {

    @Test
    public void appendKeyValWhenQueryExistsTest() throws Exception {
        URL inputUrl = new URL("http://test.com?search=test#page1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("additional_key", "additional_value");
        urlBuilder.appendKeyVal(kv);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals("http://test.com?search=test&additional_key=additional_value#page1", builtUrl.toString());
    }

}