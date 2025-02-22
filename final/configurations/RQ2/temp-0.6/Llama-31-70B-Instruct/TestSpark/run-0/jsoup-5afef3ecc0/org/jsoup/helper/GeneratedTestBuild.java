package org.jsoup.helper;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL outputUrl = urlBuilder.build();
            assertEquals("https://www.example.com", outputUrl.toString());
        } catch (MalformedURLException e) {
            fail("Failed to build URL");
        }
    }

}