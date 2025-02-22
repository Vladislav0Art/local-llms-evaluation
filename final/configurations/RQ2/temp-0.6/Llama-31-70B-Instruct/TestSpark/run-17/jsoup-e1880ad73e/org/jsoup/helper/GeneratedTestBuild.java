package org.jsoup.helper;

public class GeneratedTestBuild {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("http://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuild() throws MalformedURLException {
        URL expected = new URL("http://example.com");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}