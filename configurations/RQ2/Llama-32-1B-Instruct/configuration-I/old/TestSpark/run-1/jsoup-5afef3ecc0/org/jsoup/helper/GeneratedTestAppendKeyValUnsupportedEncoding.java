package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyValUnsupportedEncoding {

    @Test
    public void testAppendKeyValUnsupportedEncoding() {
        String inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();

        when(String.class.getKeyValue()).thenReturn("key1=value1");
        when(String.class.getOtherValue()).thenReturn("otherValue");

        try {
            assertEquals(null, url.getKeyValue());
            assertEquals(null, url.getOtherValue());
        } catch (UnsupportedEncodingException e) {
        }

        when(String.class.getOtherValue()).thenThrow(UnsupportedEncodingException.class);

        try {
            assertEquals(null, url.getKeyValue());
            assertEquals(null, url.getOtherValue());
        } catch (UnsupportedEncodingException ex) {
        }

        when(String.class.getOtherValue()).thenReturn("otherValue");

        try {
            assertEquals(null, url.getKeyValue());
            assertEquals("otherValue", url.getOtherValue());
        } catch (UnsupportedEncodingException ex) {
        }
    }

}