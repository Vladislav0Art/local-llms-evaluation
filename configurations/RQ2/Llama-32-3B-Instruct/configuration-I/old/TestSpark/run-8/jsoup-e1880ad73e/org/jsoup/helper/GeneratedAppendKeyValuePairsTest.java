package org.jsoup.helper;

public class GeneratedAppendKeyValuePairsTest {

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
    public void appendKeyValuePairsTest() {
        UrlBuilder builder = new UrlBuilder(new URL(scheme + "://" + host + ":" + port + path));
        builder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        String expected = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        assertEquals(expected, urlBuilder.build().getQuery());
    }

}