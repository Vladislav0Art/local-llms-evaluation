package org.jsoup.helper;

public class GeneratedTestConnectWithMultipleCookieStores {

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
    public void testConnectWithMultipleCookieStores() throws IOException {
        CookieManager cookieManager1 = new CustomCookieManager();
        CookieManager cookieManager2 = new CustomCookieManager();
        cookieManager1.setCookies(Collections.singletonMap("cookie1", "value1"));
        cookieManager2.setCookies(Collections.singletonMap("cookie2", "value2"));
        mock.connect(url);
        assertEquals(mock, mock);

        verify(connection).connect(url);
        verify(cookieManager1).setCookies(Collections.singletonMap("cookie1", "value1"));
        verify(cookieManager2).setCookies(Collections.singletonMap("cookie2", "value2"));
    }

}