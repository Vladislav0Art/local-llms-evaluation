package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedAppendKeyVal_NullInput_ThrowsNullPointerException {

    @Test
    public void appendKeyVal_NullInput_ThrowsNullPointerException() throws Exception {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

}