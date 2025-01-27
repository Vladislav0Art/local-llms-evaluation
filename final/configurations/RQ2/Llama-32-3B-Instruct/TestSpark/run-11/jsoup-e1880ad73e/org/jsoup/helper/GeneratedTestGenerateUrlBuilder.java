package org.jsoup.helper;

public class GeneratedTestGenerateUrlBuilder {

    @Test
    public void testGenerateUrlBuilder() {
        UrlBuilder builder = new UrlBuilder("https://www.example.com");
        String result = builder.build();
        System.out.println(result);
    }
}

class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public String build() {
        return url;
    }
}

public class Connection {
    public interface KeyVal {
        void testMethod();
    }

    public static class MockConnection implements KeyVal {
        @Override
        public void testMethod() {
        }
    }

}