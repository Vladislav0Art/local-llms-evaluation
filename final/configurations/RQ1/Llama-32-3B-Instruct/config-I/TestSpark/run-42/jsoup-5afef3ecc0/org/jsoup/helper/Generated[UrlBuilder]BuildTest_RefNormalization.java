package org.jsoup.helper;

public class Generated[UrlBuilder]

BuildTest_RefNormalization {

    @Test
    public void [UrlBuilder]BuildTest_RefNormalization() {
        URL inputUrl = new URL("http://example.com/path?query#  fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedRef = "#20fragment";
        assertEquals(expectedRef, urlBuilder.u.getRef());
    }

}