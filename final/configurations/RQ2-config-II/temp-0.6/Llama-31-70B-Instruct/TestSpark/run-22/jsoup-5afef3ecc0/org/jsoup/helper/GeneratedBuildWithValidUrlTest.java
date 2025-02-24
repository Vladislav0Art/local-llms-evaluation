package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithValidUrlTest {

    private UrlBuilder builder;

    @Test
    public void buildWithValidUrlTest() throws URISyntaxException, MalformedURLException {
        URL url = new URL("http://www.example.com/");
        builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

}