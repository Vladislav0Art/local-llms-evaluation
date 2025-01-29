package org.jsoup.helper;

public class GeneratedTestMethod {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testMethod() throws IOException {
        Method method = Method.HEAD;
        httpConnection = HttpConnection.connect("https://example.com", method);
        Assert.assertTrue(httpConnection.method(method));
    }

}