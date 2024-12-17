package org.jsoup.helper;

public class GeneratedTest {

    private URLBuilder urlBuilder;

    @Mock
    private Connection connection;

    @InjectMocks
    private UrlBuilder urlBuilderMock;

    public void setUp() {
        String inputUrl = "https://example.com/path?query=value";
        urlBuilder = new UrlBuilder(inputUrl);
        Mockito.mockBean(connection.class);

        URLBuilder urlBuilderWithRef = new UrlBuilder("https://example.org/ref?value=ref");
        urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
    }

    @Test
    public void testAppendKeyVal() {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        String expectedQuery = "?key=value";
        Assert.assertEquals(expectedQuery, urlBuilder.getNormalizedUrl());
    }

    @Test
    public void testAppendKeyVal_NullKeyVal() {
        urlBuilder.appendKeyVal(null);
        String expectedQuery = null;
        Assert.assertEquals(expectedQuery, urlBuilder.getNormalizedUrl());
    }

    @Test
    public void testAppendKeyVal_MalformedKeyVal() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert false; // no assertion in this method as it's not under test
    }

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path?query=value";
        URLBuilder urlBuilderWithRef = new UrlBuilder(inputUrl);
        String expectedQuery = "?key=value";
        String expectedReference = "#ref";
        urlBuilderMock = new UrlBuilder(urlBuilderWithRef);

        try {
            URL url = urlBuilder.build();
            Assert.assertEquals(expectedQuery, url.toString());
            Assert.assertEquals(expectedReference, url.getFragment());
        } catch (MalformedURLException e) {
            assert false; // not under test
        }
    }

    @Test
    public void testAppendKeyVal_MalformedUrl() throws UnsupportedEncodingException {
        try {
            URLBuilder urlBuilderWithRef = new UrlBuilder("invalid-url?query=value");
            urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
            Assert.fail();
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().contains("Remote end is able to handle it"));
        }
    }

    @Test
    public void testAppendKeyVal_MalformedURL() throws UnsupportedEncodingException {
        try {
            URLBuilder urlBuilderWithRef = new UrlBuilder("https://example.com/path?query=value");
            urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
            Assert.fail();
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().contains("Remote end is able to handle it"));
        }
    }

    @Test
    public void testAppendKeyVal_MalformedURL_InvalidQuery() throws UnsupportedEncodingException {
        try {
            URLBuilder urlBuilderWithRef = new UrlBuilder("https://example.com/path?query=valid");
            urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
            Assert.fail();
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().contains("Remote end is able to handle it"));
        }
    }

    @Test
    public void testAppendKeyVal_MalformedURL_InvalidQuery_2() throws UnsupportedEncodingException {
        try {
            URLBuilder urlBuilderWithRef = new UrlBuilder("https://example.com/path?query=valid&ref=value");
            urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
            Assert.fail();
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().contains("Remote end is able to handle it"));
        }
    }

    @Test
    public void testAppendKeyVal_MalformedURL_InvalidQuery_3() throws UnsupportedEncodingException {
        try {
            URLBuilder urlBuilderWithRef = new UrlBuilder("https://example.com/path?query=valid#ref");
            urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
            Assert.fail();
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().contains("Remote end is able to handle it"));
        }
    }

}