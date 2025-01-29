package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_InvalidKey {

    @Test
    public void testAppendKeyVal_InvalidKey() throws UnsupportedEncodingException {
        String input = "key1=value1&invalid_key=invalid_value";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        urlBuilder.appendKeyVal(new Connection.KeyVal("valid_key", "value"));
    }

}