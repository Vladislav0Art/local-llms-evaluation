package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedAppendKeyVal_ValidInput_ReturnsCorrectUrl {

    @Test
    public void appendKeyVal_ValidInput_ReturnsCorrectUrl() throws Exception {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "val", false);
        urlBuilder.appendKeyVal(keyVal);
        URL actualUrl = urlBuilder.build();
        assertEquals(inputUrl, actualUrl);
    }

}