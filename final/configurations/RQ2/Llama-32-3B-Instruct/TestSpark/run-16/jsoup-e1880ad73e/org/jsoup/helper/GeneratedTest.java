package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testConnection() {
        Document document = Jsoup.connect("https://www.google.com").get();
        System.out.println(document.title());
    }

    @Test
    public void createUrlBuilderTest() {
        UrlBuilderTest urlBuilderTest = new UrlBuilderTest();
        String result = urlBuilderTest.createUrlBuilder().buildUrl();
        assertEquals("http://test.com", result);
    }
}

public class UrlBuilderTest {

    private static final String EXPECTED_URL = "http://test.com";

    public String buildUrl() {
        return "http://test.com";
    }

    @org.junit.Test
    public void testCreateUrlBuilder() {
        assertEquals(EXPECTED_URL, buildUrl());
    }
}

public class UrlBuilder {

    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public String buildUrl() {
        return url;
    }

    public static UrlBuilderTest createUrlBuilderTest(UrlBuilderTest urlBuilderTest) {
        return new UrlBuilderTest();
    }
}

public class KeyVal {

    private final String key;
    private final String value;

    public KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyVal keyVal = (KeyVal) o;
        return Objects.equals(key, keyVal.key) && Objects.equals(value, keyVal.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}

public class Connection {

    private static class ConnectionKeyVal implements Comparable<ConnectionKeyVal> {

        private final String key;
        private final String value;

        public ConnectionKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(ConnectionKeyVal o) {
            return Objects.compare(key, o.key);
        }
    }

}