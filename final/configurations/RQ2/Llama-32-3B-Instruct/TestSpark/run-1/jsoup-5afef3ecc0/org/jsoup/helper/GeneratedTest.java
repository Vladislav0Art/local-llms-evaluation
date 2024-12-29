package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuildWithValidKey() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("key", "value");
        assertTrue(result.contains("key=value"));
    }

    @Test
    public void testBuildWithInvalidKey() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("", "value");
        assertTrue(result.contains("key="));
    }

    @Test
    public void testBuildWithNullValue() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("key", null);
        assertTrue(result.contains("key="));
    }

    @Test
    public void testBuildWithEmptyKey() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String result = urlBuilder.build("", "value");
        assertTrue(result.isEmpty());
    }
}

public class UrlBuilder {

    private StringBuilder sb = new StringBuilder();

    public String build(String key, String value) {
        if (key == null || key.isEmpty()) {
            return "";
        } else {
            sb.append(key).append("=").append(value);
            return sb.toString();
        }
    }

    public static class Connection {

        private byte[] bytes;

        public void setBytes(byte[] bytes) {
            this.bytes = bytes;
        }

        public String getBytes() throws UnsupportedEncodingException {
            // convert to string
            return new String(bytes, "UTF-8");
        }
    }
}

@Test
public void testGetBytes() {
    UrlBuilder.Connection connection = new UrlBuilder.Connection();
    connection.setBytes(new byte[]{1, 2, 3});
    try {
        String result = connection.getBytes();
        assertEquals("UTF-8", result);
    } catch (UnsupportedEncodingException e) {
        fail(e.getMessage());
    }
}

@Test
public void testGetBytesError() {
    UrlBuilder.Connection connection = new UrlBuilder.Connection();
    connection.setBytes(new byte[]{1, 2, 3});
    try {
        String result = null;
        assertThrows(UnsupportedEncodingException.class, () -> String.valueOf(result));
    } catch (UnsupportedEncodingException e) {
        fail(e.getMessage());
    }
}

}