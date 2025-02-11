package org.jsoup.helper;

public class GeneratedTestKeyVal {

    // ...

    public static class KeyVal implements Connection.KeyVal {
        private String key;
        private String value;
        private InputStream stream;
        private String contentType;

        public static KeyVal create(String key, String value) {
            return new KeyVal(key, value);
        }

        public static KeyVal create(String key, String filename, InputStream stream) {
            return new KeyVal(key, filename)
                    .inputStream(stream);
        }

        private KeyVal(String key, String value) {
            Validate.notEmptyParam(key, "key");
            Validate.notNullParam(value, "value");
            this.key = key;
            this.value = value;
        }

        public KeyVal key(String key) {
            Validate.notEmptyParam(key, "key");
            this.key = key;
            return this;
        }

        public String key() {
            return key;
        }

        public KeyVal value(String value) {
            Validate.notNullParam(value, "value");
            this.value = value;
            return this;
        }

        public String value() {
            return value;
        }

        public KeyVal inputStream(InputStream inputStream) {
            Validate.notNullParam(value, "inputStream");
            this.stream = inputStream;
            return this;
        }

        public InputStream inputStream() {
            return stream;
        }

        public boolean hasInputStream() {
            return stream != null;
        }

        @Override
        public Connection.KeyVal contentType(String contentType) {
            Validate.notEmpty(contentType);
            this.contentType = contentType;
            return this;
        }

        @Override
        public String contentType() {
            return contentType;
        }
    }

    // ...
}

public class ConnectionTest {

    @Before
    public void setUp() {
        // setup method
    }

    @After
    public void tearDown() {
        // teardown method
    }

    @Test
    public void testKeyVal() {
        KeyVal keyVal = Connection.KeyVal.create("key", "value");
        Assert.assertEquals("key", keyVal.key());
        Assert.assertEquals("value", keyVal.value());

        keyVal = Connection.KeyVal.create("key", "filename", null);
        Assert.assertTrue(keyVal.hasInputStream());
    }

}