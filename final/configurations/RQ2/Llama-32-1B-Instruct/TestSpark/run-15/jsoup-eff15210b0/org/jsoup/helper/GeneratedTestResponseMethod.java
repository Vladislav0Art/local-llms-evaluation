package org.jsoup.helper;

public class GeneratedTestResponseMethod {

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
    public void testResponseMethod() throws IOException {
        Document document = parseDocument("Content-Type: text/html; charset=UTF-8");
        assert (document.select("body").size() == 1);

        HttpConnection connection = connect(URL);
        String responseText = connection.response();
        Assert.assertEquals("Hello World!", responseText);

        document = parseDocument(responseText);
        assert (document.select("body").size() == 1);

        HttpConnection connection2 = connect(URL);
        String responseText2 = connection2.response();
        Assert.assertEquals("Hello World!", responseText2);
    }

    private void parseDocument(String html) throws IOException {
        Document document = Jsoup.parse(html, "http://www.example.com", parser);
        return document;
    }

}