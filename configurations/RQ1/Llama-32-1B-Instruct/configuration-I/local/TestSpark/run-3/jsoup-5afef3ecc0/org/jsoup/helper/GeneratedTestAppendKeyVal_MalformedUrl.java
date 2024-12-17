package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedUrl {

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
    public void testAppendKeyVal_MalformedUrl() throws UnsupportedEncodingException {
        try {
            URLBuilder urlBuilderWithRef = new UrlBuilder("invalid-url?query=value");
            urlBuilderMock = new UrlBuilder(urlBuilderWithRef);
            Assert.fail();
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().contains("Remote end is able to handle it"));
        }
    }

}