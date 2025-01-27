package org.jsoup.helper;

public class GeneratedTest {

    public Document buildJsoup(String html) {
        return Jsoup.parse(html);
    }

    @Test
    public void test() throws Exception {
        String html = "<html><body><p>Hello World!</p></body></html>";
        Document document = buildJsoup(html);

        Element pElement = document.selectFirst("p");
        assertEquals("Hello World!", pElement.text());

        Elements spanElements = document.select(".span-class");
        assertEquals(2, spanElements.size());
    }

    public class Connection {
        private URI url;

        public Connection(String url) {
            this.url = URI.create(url);
        }

        public URI getUrl() {
            return url;
        }

        public URI getUri() {
            return url;
        }
    }

    public class UrlBuilder {
        private String url;

        public UrlBuilder(String url) {
            this.url = url;
        }

        public void appendKeyVal(KeyVal kv, String value) {
            // Implement method logic
        }
    }

    public class KeyVal {
        private String key;

        public KeyVal(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }

}