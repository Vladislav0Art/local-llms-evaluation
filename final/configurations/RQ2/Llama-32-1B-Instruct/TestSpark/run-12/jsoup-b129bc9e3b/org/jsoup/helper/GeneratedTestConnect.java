package org.jsoup.helper;

public class GeneratedTestConnect {

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
    public void testConnect() throws IOException {
        mock.connect(url);
        assertEquals(mock, mock);

        verify(connection).connect(url);
        verifyNoMoreInteractions();
    }

}