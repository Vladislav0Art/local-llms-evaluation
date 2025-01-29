package org.jsoup.helper;

public class GeneratedTestDataWithInputStream {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testDataWithInputStream() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{1, 2, 3, 4});
        String key = "testKey";
        String value = "testValue";
        httpConnection = HttpConnection.connect(key, value);
        Assert.assertEquals(value, (String) httpConnection.data(key, null, inputStream));
    }

}