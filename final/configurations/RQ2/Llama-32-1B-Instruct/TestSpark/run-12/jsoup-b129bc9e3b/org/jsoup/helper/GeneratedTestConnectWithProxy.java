package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

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
    public void testConnectWithProxy() throws IOException {
        mock.setProxy("http://proxy:8080", "http://new-proxy");
        mock.connect(url);
        assertEquals(mock, mock);

        verify(connection).connect(url);
        verifyNoMoreInteractions();
    }

}