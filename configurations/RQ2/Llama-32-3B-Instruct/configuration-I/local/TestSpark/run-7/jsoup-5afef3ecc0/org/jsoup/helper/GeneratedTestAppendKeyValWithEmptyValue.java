package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyValue {

    @Test
    public void testAppendKeyValWithEmptyValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder();
        String keyValStr = "key1="; // empty value
        Connection.KeyVal kv = createMockKeyVal();
        assertNotNull(urlBuilder);
        urlBuilder.appendKeyVal(kv);
        assertEquals(keyValStr, urlBuilder.toString());
    }

    private static String createMockKeyVal() {
        return "key1=value1";
    }
}

public class UrlBuilder {
    private StringBuilder sb;

    public UrlBuilder() {
        sb = new StringBuilder();
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        sb.append(kv.getKey()).append("=").append(kv.getValue());
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

public class Connection {
    public interface KeyVal {
        String getKey();

        String getValue();
    }

}