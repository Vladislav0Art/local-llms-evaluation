package org.jsoup.helper;

public class GeneratedTestDataWithContentType {

    private String key;
    private String value;

    public Connection(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class InputStream {
    public static Connection data(String key, String value, InputStream inputStream) {
        return new Connection(key, value);
    }

    public static Connection data(String key, String value, String contentType) {
        return data(key, value, null);
    }

    public static InputStream newByteArrayInputStream(byte[] bytes) {
        return null;
    }

    public static InputStream newEmptyByteArrayInputStream() {
        return null;
    }
}

public class InputSteamUtil {

    public static Connection createConnection(String key, String value) {
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        return InputStream.data(key, value, inputStream);
    }

    public static Connection createConnectionWithContentType(String key, String value) {
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        return InputStream.data(key, value, null);
    }
}

public class TestHttpConnection {

    @Test
    public void testDataWithContentType() {
        InputStream inputStream = InputStreamUtil.createEmptyByteArrayInputStream();
        Connection connection = InputStreamUtil.createConnectionWithContentType("key", "value");
    }

}