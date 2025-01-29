package org.jsoup.helper;

public class GeneratedTestConnectMethod {

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
    public void testConnectMethod() {
        Request.Method method = new Request.Method("GET", "http://example.com");
        Response.Response response1 = httpConnection.execute(method);
        assert response1.statusCode() == 200;
    }

}