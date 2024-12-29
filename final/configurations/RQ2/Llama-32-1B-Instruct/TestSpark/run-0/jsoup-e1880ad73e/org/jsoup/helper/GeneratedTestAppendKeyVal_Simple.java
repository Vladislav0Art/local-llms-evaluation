package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_Simple {

    @Test
    public void testAppendKeyVal_Simple() {
        String inputUrl = "https://example.com";
        URLBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com?key1=value1&key2=value2";
        when(builder.build()).thenReturn(new Uri(expectedUrl));
        assertEquals(expectedUrl, builder.build());
    }

}