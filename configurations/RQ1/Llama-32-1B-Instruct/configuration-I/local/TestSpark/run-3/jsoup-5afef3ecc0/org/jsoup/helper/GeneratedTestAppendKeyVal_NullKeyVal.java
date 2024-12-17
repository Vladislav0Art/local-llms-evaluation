package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NullKeyVal {

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
    public void testAppendKeyVal_NullKeyVal() {
        urlBuilder.appendKeyVal(null);
        String expectedQuery = null;
        Assert.assertEquals(expectedQuery, urlBuilder.getNormalizedUrl());
    }

}