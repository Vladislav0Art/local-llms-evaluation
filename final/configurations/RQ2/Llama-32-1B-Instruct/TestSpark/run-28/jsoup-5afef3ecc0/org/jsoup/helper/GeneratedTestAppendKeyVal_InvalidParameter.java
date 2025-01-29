package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_InvalidParameter {

    @Test
    public void testAppendKeyVal_InvalidParameter() throws UnsupportedEncodingException {
        String input = "key1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null, "value"));
    }

}