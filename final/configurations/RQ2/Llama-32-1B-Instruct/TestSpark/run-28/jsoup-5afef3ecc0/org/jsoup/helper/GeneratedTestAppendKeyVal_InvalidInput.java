package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_InvalidInput {

    @Test
    public void testAppendKeyVal_InvalidInput() {
        try {
            String input = "invalid_input";
            URLBuilder urlBuilder = new UrlBuilder(new URI(input));
            assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(null));
        } catch (Exception e) {
            // Expected exception
        }
    }

}