package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KeyValuesWithEmptyString {

    @Test
    public void testAppendKeyVal_KeyValuesWithEmptyString() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        Url url = new UrlBuilder(inputUrl).build();
        assertEquals("http://example.com?key=&value", url.toString());
    }

}