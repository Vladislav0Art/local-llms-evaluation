package org.jsoup.helper;

public class GeneratedTestKeyVal {

    private Connection connection;
    private URL url;

    @Test
    public void testKeyVal() {
        keyval = new org.jsoup.helper.KeyVal();
        connection = HttpConnection.connect();
        String body = connection.getKeyVal(keyval);
        assertEquals("key1=value1", body);
    }

}