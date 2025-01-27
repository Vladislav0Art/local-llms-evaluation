package org.jsoup.helper;

public class GeneratedTestKeyVal {

    private String key;
    private String value;

    public KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyVal{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

public class Connection implements KeyVal {
    private String key;
    private String value;

    public Connection(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyVal{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

public class UrlBuilderTest {

    @Test
    public void testKeyVal() throws Exception {
        Connection.KeyVal keyVal = new KeyVal("key", "value");
        Connection.KeyVal keyVal2 = new KeyVal("key", "value2");

        UrlBuilder urlBuilder = new UrlBuilder();
        Object result1 = urlBuilder.build();
        Mockito.when(urlBuilder.appendKeyVal(keyVal)).thenReturn(null);
        Object result2 = urlBuilder.appendKeyVal(keyVal2);

        org.junit.Assert.assertEquals(result1, null);
        org.junit.Assert.assertEquals(result2, keyVal2);
    }
}

public class UrlBuilder {
    public void appendKeyVal(Connection.KeyVal keyVal) {
    }

    public Object build() {
        return null;
    }

    public static class UrlBuilderImpl implements UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal keyVal) {
        }

        @Override
        public Object build() {
            return null;
        }
    }

    public static class UrlBuilderTestImpl implements UrlBuilder {
        private Connection.KeyVal keyVal;

        public static final String KEY = "key";
        public static final String VALUE = "value";

        @Override
        public void appendKeyVal(Connection.KeyVal keyVal) {
            this.keyVal = keyVal;
        }

        @Override
        public Object build() {
            return this.keyVal;
        }
    }

}