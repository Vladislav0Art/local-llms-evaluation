package org.jsoup.helper;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://www.example.com"));
        URL url = builder.build();
        assertEquals("http://www.example.com", url.toExternalForm());
    }

}