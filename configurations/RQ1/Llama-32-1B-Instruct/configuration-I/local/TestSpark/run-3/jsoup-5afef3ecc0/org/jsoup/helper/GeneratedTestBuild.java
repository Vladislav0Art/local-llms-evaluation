package org.jsoup.helper;

public class GeneratedTestBuild {

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

}