package org.jsoup.helper;

public class GeneratedTestPostMethod {

    private static final String URL = "https://www.example.com";
    private static final CookieStore cookieStore;
    private static final Parser parser;

    @Before
    public void setup() throws Exception {
        cookieStore = new DefaultCookieStore();
        parser = new DefaultParser();
    }

    public Connection connect(String url) throws MalformedURLException, SocketException {
        HttpConnection connection = new HttpConnection();
        connection.connect(url);
        return connection;
    }

    public Connection connect(URL url) throws MalformedURLException, SocketException {
        HttpConnection connection = new HttpConnection();
        connection.connect(url);
        return connection;
    }

    @Test
    public void testPostMethod() throws IOException {
        Document document = parseDocument("Content-Type: text/html; charset=UTF-8");
        assert (document.select("body").size() == 1);

        HttpConnection connection = connect(URL);
        Connection request = connection.request(Request.POST, "key=value", "data", new HashMap<>());
        Assert.assertEquals(200, request.getResponse().getStatusCode());

        document = parseDocument(request.responseText());
        assert (document.select("body").size() == 1);

        HttpConnection connection2 = connect(URL);
        String responseText = connection2.response();
        Assert.assertEquals("Hello World!", responseText);
    }

}