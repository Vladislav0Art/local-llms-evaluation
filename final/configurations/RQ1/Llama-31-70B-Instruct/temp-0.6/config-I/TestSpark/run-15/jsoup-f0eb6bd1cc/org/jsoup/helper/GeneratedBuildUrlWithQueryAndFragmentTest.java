package org.jsoup.helper;

public class GeneratedBuildUrlWithQueryAndFragmentTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
    }

    @Test
    public void buildUrlWithQueryAndFragmentTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        urlBuilder.u = new URL("http://www.example.com#fragment");
        URL expected = new URL("http://www.example.com?key=value#fragment");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}