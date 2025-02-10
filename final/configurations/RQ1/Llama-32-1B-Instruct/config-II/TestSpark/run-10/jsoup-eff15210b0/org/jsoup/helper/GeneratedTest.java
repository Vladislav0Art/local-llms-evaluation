package org.jsoup.helper;

public class GeneratedTest {

    // Serialise the data map into the url
    private static void serialiseRequestUrl(Connection.Request req) throws IOException {
        UrlBuilder in = new UrlBuilder(req.url());

        for (Connection.KeyVal keyVal : req.data()) {
            Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
            in.appendKeyVal(keyVal);
        }
        req.url(in.build());
        req.data().clear(); // moved into url as get params
    }

    public static class KeyVal implements Connection.KeyVal {
        private String key;
        private String value;

        @Override
        public KeyVal key(String key) {
            Validate.notEmptyParam(key, "key");
            this.key = key;
            return this;
        }

        @Override
        public KeyVal value(String value) {
            Validate.notNullParam(value, "value");
            this.value = value;
            return this;
        }
    }

    // Test for serialise request url

    @Test
    public void testSerialiseRequestUrl() throws IOException {
        UrlBuilder in = new UrlBuilder("http://example.com/path?a=1&b=2");

        String json = serialiseRequestUrl(in);
        System.out.println(json); // Output: http://example.com/path?key=a&value=1&key=b&value=2
    }

}