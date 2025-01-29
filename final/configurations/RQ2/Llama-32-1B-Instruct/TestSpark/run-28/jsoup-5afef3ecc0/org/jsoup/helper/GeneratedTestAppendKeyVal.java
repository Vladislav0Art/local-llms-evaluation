package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String input = "key1=value1&key2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key3", "value3"));
    }

}