package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_InvalidKeyVal {

    @Test
    public void testAppendKeyVal_InvalidKeyVal() throws UnsupportedEncodingException {
        String input = "key1=value1&key3=value3";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(null));
    }

}