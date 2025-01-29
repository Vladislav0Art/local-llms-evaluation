package org.jsoup.helper;

public class GeneratedTestParserMethod {

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
    public void testParserMethod() throws IOException {
        Document document = parseDocument("Hello World!");
        assert (document.select("body").size() == 1);

        HttpConnection connection = connect(URL);
        document = connection.get();
        Assert.assertEquals("Hello World!", document.text().toString());
    }

}