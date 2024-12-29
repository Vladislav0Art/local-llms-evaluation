package org.jsoup.helper;

public class GeneratedTestBuildWithEmptyKey {

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

}