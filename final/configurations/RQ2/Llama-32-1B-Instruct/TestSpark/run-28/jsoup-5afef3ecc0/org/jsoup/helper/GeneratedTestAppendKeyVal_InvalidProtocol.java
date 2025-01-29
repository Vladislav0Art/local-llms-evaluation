package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_InvalidProtocol {

    @Test
    public void testAppendKeyVal_InvalidProtocol() throws UnsupportedEncodingException {
        String input = "https://example.com/path?param1=value1&param2=value2";
        assertThrows(URISyntaxException.class, () -> new UrlBuilder(new URI(input).getScheme()).appendKeyVal(new Connection.KeyVal("key1", "value1")));
    }

}