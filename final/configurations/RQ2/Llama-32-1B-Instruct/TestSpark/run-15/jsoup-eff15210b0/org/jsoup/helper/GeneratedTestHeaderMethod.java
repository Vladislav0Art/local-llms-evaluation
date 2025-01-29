package org.jsoup.helper;

public class GeneratedTestHeaderMethod {

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
    public void testHeaderMethod() throws IOException {
        Document document = parseDocument("Content-Type: text/html; charset=UTF-8");
        assert (document.select("head").size() == 1);

        HttpConnection connection = connect(URL);
        Map<String, String> headers = connection.headers(new HashMap<>());
        Assert.assertEquals("text/html", headers.get("Content-Type"));
    }

}