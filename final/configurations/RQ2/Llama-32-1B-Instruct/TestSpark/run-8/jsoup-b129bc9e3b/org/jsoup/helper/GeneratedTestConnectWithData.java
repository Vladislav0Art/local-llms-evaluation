package org.jsoup.helper;

public class GeneratedTestConnectWithData {

    private static final String HTTP_VERSION = "HTTP/1.1";

    @Test
    public void testConnectWithData() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Assert.assertEquals(connection.getData(data), "value");
    }

}