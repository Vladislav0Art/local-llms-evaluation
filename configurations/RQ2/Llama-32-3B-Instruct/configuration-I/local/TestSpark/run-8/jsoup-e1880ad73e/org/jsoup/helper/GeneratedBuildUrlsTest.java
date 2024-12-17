package org.jsoup.helper;

public class GeneratedBuildUrlsTest {

    @Mock
    private Connection connection;

    @Mock
    private String scheme;

    @Mock
    private String host;

    @Mock
    private int port;

    @Mock
    private String path;

    @Mock
    private String query;

    @Mock
    private String fragment;

    public UrlBuilderTest() {
        // Initialize any necessary mocks here
    }

    @Before
    public void setup() {
        // Setup any necessary mocks or state here
    }

    @Test
    public void buildUrlsTest() throws URISyntaxException {
        URL inputUrl = new URL(scheme + "://" + host + ":" + port + path);
        when(connection.url()).thenReturn(inputUrl);
        String expected = scheme + "://" + host + ":" + port + path;
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        assertEquals(expected, urlBuilder.build().toString());
    }

}