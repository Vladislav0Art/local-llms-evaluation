package org.jsoup.helper;

public class GeneratedBuildUrl_nonEmptyString_returnNonEmptyString {

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
}

public class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal keyVal) {
        if (url.isEmpty()) {
            url = String.format("%s=%s", keyVal.getKey(), keyVal.getValue());
        } else {
            url += String.format("&%s=%s", keyVal.getKey(), keyVal.getValue());
        }
    }

    public URL build() {
        return new URL(url);
    }
}

public class GeneratedTest {

    @Test
    public void buildUrl_nonEmptyString_returnNonEmptyString() {
        // Arrange and Act
        String input = "http://example.com";
        UrlBuilder builder = new UrlBuilder(input);
        URL result = builder.build();

        // Assert
        assertThat(result, is(new URL(input)));
    }

}