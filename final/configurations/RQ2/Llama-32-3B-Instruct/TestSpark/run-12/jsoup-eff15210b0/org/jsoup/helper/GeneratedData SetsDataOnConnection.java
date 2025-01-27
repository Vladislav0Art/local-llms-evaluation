package org.jsoup.helper;

public class GeneratedData SetsDataOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void data

    SetsDataOnConnection() {
        String key = "value";
        Connection connection = HttpConnection.data(key);
        assertEquals(true, connection.getData().containsKey(key));
    }

}