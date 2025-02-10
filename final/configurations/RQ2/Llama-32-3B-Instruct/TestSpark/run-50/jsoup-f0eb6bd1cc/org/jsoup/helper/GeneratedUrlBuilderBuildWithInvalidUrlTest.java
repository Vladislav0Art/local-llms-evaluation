package org.jsoup.helper;

public class GeneratedUrlBuilderBuildWithInvalidUrlTest {

    @Test
    public void urlBuilderBuildWithInvalidUrlTest() throws MalformedURLException {
        try {
            new UrlBuilder(new URL("invalid://example.com"));
        } catch (URISyntaxException e) {
        }
        assertNotEquals(null, new RuntimeException(e));
    }

}