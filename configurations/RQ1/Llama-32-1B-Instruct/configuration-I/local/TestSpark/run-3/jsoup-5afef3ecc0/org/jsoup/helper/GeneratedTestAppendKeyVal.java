package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

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

}