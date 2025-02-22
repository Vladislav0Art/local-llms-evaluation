package org.jsoup.helper;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://www.example.com/");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}