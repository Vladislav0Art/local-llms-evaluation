package org.jsoup.helper;

public class GeneratedBuildUrlTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
    }

    @Test
    public void buildUrlTest() throws URISyntaxException, MalformedURLException {
        URL expected = new URL("http://www.example.com");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}