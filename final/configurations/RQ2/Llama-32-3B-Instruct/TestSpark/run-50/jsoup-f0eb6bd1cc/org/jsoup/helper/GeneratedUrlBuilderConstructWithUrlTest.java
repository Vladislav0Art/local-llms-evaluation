package org.jsoup.helper;

public class GeneratedUrlBuilderConstructWithUrlTest {

    @Test
    public void urlBuilderConstructWithUrlTest() throws MalformedURLException {
        String expectedUrl = "http://example.com";
        URL url = new URL(expectedUrl);
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
    }

}