package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testIgnoreHttpErrors() throws IOException {
        boolean ignoreHttpErrors = true;
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertFalse(httpConnection.ignoreHttpErrors(ignoreHttpErrors));
    }

}