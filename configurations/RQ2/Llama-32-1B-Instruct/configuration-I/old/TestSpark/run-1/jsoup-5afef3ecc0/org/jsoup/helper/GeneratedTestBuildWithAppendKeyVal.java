package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestBuildWithAppendKeyVal {

    @Test
    public void testBuildWithAppendKeyVal() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();
        assertNotNull(url);

        when(String.class.getKeyValue()).thenReturn("key1=value1");
        when(String.class.getOtherValue()).thenReturn("otherValue");

        assertEquals(new org.jsoup.helper.URL(url.toString()), new UrlBuilder("https://example.com").build());
    }

}