package org.jsoup.helper;

public class GeneratedTestConnectWithCookieStore {

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
    public void testConnectWithCookieStore() throws IOException {
        CookieManager cookieManager = new CustomCookieManager();
        cookieManager.setCookies(Collections.singletonMap("cookie", "value"));
        mock.connect(url);
        assertEquals(mock, mock);

        verify(connection).connect(url);
        verify(cookieManager).setCookies(Collections.singletonMap("cookie", "value"));
    }

}