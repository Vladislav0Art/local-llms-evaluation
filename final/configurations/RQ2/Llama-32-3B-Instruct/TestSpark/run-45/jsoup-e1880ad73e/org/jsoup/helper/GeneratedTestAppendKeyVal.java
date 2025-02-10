package org.jsoup.helper;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAppendKeyVal {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public static KeyVal of(String key, String value) {
            return new KeyVal(key, value);
        }
    }

}

@RunWith(MockitoJUnitRunner.class)
public class UrlBuilderTest {

    @Mock
    private org.junit.runner.Description description;

    @Mock
    private Connection connection;

    @Before
    public void setup() {
        // given
        URL inputUrl = new URL("https://www.example.com");
        // when
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        // then
        Mockito.verify(urlBuilder).inputUrl();
        org.junit.Assert.assertNotNull(urlBuilder);
        org.junit.Assert.assertEquals(inputUrl, urlBuilder.inputUrl());
    }

    @Test
    public void testAppendKeyVal() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        Connection.KeyVal[] keyVals = {Connection.KeyVal.of("key1", "value1"), Connection.KeyVal.of("key2", "value2")};
        // when
        String result = urlBuilder.appendKeyVal(keyVals);
        // then
        assertEquals("https://www.example.com?key1=value1&key2=value2", result);
    }

    public static class UrlBuilder {
        private URL inputUrl;

        public UrlBuilder(URL inputUrl) {
            this.inputUrl = inputUrl;
        }

        public String build(String query) {
            if (query != null && !query.isEmpty()) {
                return inputUrl.toString() + "?" + query;
            } else {
                return inputUrl.toString();
            }
        }

        public String build() {
            return build("");
        }

        public String appendKeyVal(Connection.KeyVal[] keyVals) {
            StringBuilder sb = new StringBuilder(inputUrl.toString());
            for (Connection.KeyVal kv : keyVals) {
                sb.append("&").append(kv.getKey()).append("=").append(kv.getValue());
            }
            return sb.toString();
        }

        public URL inputUrl() {
            return inputUrl;
        }
    }

}