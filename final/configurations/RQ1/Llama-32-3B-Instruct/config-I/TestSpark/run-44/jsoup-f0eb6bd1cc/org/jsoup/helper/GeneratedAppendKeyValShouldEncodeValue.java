package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValShouldEncodeValue {

    @Mock
    private Connection connection;

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static class GeneratedTest {
        public static class KeyVal extends org.jsoup.helper.GeneratedTest.KeyVal {

            public void appendTo(Connection connection) {
                // implementation
            }
        }
    }

    @Test
    public void appendKeyValShouldEncodeValue() {
        GeneratedTest.KeyVal kv = new GeneratedTest.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        // implement append method with encoded value
        String query = builder.q.toString();
        assert query.equals("key=value");
    }

}