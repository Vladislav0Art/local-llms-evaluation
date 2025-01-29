package org.jsoup.helper;

public class GeneratedTestConnectCookieStore {

    private static HttpConnection httpConnection;
    private static final CookieStore cookieStore = new DefaultCookieStore();

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
        Set<Request.KeyVal> requestKeys = new LinkedHashSet<>();
        Request.RequestBuilder builder = new Request.RequestBuilder("http://example.com", Method.HEAD);
        Request.Request response = builder.build();
        Response.Response response1 = httpConnection.execute(response);
        requestKeys.add(new KeyVal("Accept-Language", "en-US, fr-FR"));
        cookieStore.addCookies(response1.cookies());
    }

    @Test
    public void testConnectCookieStore() {
        CookieManager cookieManager = new DefaultCookieManager();
        CookieStore cookieStoreCopy = new DefaultCookieStore(cookieManager);
        ConnectRequest connectRequest = new ConnectRequest("http://example.com", httpConnection.proxy());
        Response.Response response1 = httpConnection.execute(connectRequest);
        assert response1.statusCode() == 200;
        assert response1.headers().get("Set-Cookie") == "session=1234567890abcdef";
    }

}