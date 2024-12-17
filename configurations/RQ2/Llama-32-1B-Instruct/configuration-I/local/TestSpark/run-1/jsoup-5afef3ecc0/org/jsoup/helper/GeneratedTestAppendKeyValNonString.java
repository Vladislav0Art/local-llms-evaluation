package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyValNonString {

    @Test
    public void testAppendKeyValNonString() {
        String inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();

        when(String.class.getKeyValue()).thenReturn(123);
        when(String.class.getOtherValue()).thenThrow(NumberFormatException.class);

        try {
            assertEquals(null, url.getKeyValue());
            assertEquals(null, url.getOtherValue());
        } catch (UnsupportedEncodingException | NumberFormatException ex) {
        }

        when(String.class.getOtherValue()).thenReturn("otherValue");

        try {
            assertEquals(null, url.getKeyValue());
            assertEquals("otherValue", url.getOtherValue());
        } catch (UnsupportedEncodingException ex) {
        }
    }

}