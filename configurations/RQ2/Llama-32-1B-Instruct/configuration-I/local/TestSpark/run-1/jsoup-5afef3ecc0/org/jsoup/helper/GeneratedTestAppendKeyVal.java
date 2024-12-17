package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        String inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();

        when(String.class.getKeyValue()).thenReturn("key1=value1");
        when(String.class.getOtherValue()).thenReturn("otherValue");

        assertEquals("key1=value1", url.getKeyValue());
        assertEquals("otherValue", url.getOtherValue());
    }

}