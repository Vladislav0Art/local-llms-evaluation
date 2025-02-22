package org.jsoup.helper;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotNull(outputUrl);
        assertEquals("https://www.example.com/", outputUrl.toString());
    }

}