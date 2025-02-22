package org.jsoup.helper;

public class GeneratedTest {

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

    @Test
    public void buildUrlWithQueryTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL expected = new URL("http://www.example.com?key=value");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void buildUrlWithQueryAndFragmentTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        urlBuilder.u = new URL("http://www.example.com#fragment");
        URL expected = new URL("http://www.example.com?key=value#fragment");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

    @Test
    public void buildUrlWithQueryAndPortTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        urlBuilder.u = new URL("http://www.example.com:8080");
        URL expected = new URL("http://www.example.com:8080?key=value");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}