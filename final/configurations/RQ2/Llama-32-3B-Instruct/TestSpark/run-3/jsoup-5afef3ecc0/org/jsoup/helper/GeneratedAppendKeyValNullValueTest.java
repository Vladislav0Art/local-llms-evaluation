package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedAppendKeyValNullValueTest {

    @Test
    public void appendKeyValNullValueTest() throws MalformedURLException, URISyntaxException {
        String url = "http://www.test.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        urlBuilder.appendKeyVal(kv);
        assertEquals(url + "&key=", StringUtil.getValue(urlBuilder.build()));
    }

}