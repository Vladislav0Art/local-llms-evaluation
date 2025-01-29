package org.jsoup.helper;

public class GeneratedTestData {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testData() throws IOException {
        String key = "testKey";
        String value = "testValue";
        httpConnection = HttpConnection.connect(key, value);
        Assert.assertEquals(value, (String) httpConnection.data(key));
    }

}