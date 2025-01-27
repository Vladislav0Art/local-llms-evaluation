package org.jsoup.helper;

public class GeneratedTest {

    @org.junit.Test
    public void testConnection() {
        org.junit.Assert.assertThrows(IllegalStateException.class, () -> new Connection());
    }

    @Test
    public void testConnectionConstructorNoParams() {
        public static Connection connection = new Connection();
        org.junit.Assert.assertNotNull(connection);
    }

    @Test
    public void testPostDataCharset() {
        String charset = "utf-8";
        public static Connection connection = new Connection(charset);
        org.junit.Assert.assertNotNull(connection.postDataCharset());
    }

    @org.junit.Test
    public void testRequestArray() {
        Request[] requests = {new Request(), new Request()};
        Collection<Request> keyVals = Arrays.asList(requests);
        org.junit.Assert.assertEquals(keyVals.size(), 2);
    }
}

public class Connection {

    private String charset;
    private Map<String, String> data;

    public static Connection createConnection(String charset) {
        return new Connection(charset);
    }

    public String postDataCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}

}