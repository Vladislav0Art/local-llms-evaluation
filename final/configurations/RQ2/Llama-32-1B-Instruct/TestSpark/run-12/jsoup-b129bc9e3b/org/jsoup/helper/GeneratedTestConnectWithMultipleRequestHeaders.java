package org.jsoup.helper;

public class GeneratedTestConnectWithMultipleRequestHeaders {

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
    public void testConnectWithMultipleRequestHeaders() throws IOException {
        mock.connect(url);
        assertEquals(mock, mock);

        verify(connection).connect(url);
        String header = mock.request().header();
        assertEquals("Content-Type: text/html; charset=UTF-8", header);
    }

}