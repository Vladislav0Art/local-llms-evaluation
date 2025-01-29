package org.jsoup.helper;

public class GeneratedTestConnectWithCustomParser {

    private MockHttpConnection mock;
    private URL url;

    @Mock
    private HttpURLConnection connection;

    public HttpConnectionTest() {
    }

    @Before
    public void setup() {
        mock = new MockHttpConnection();
        url = new URL("https://example.com");
    }

    @Test
    public void testConnectWithCustomParser() throws IOException {
        mock.connect(url);
        assertEquals(mock, mock);

        verify(connection).connect(url);
        mock.setRequest(Parser.parser());
        String response = mock.request().get();
        assertNotNull(response);
    }

}