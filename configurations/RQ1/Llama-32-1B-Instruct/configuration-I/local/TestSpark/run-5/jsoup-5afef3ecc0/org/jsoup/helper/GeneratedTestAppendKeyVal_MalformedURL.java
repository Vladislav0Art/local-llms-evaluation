package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedURL {

    @Test
    public void testAppendKeyVal_MalformedURL() {
        UrlBuilder builder = new UrlBuilder(new MalformedURLException("invalid url"));
        assertThrows(MalformedURLException.class, () -> builder.appendKeyVal(null));
    }

}