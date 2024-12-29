package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestDataAsMap {

    private String url = "http://www.example.com";
    private Connection connection;

    public Response newRequest() {
        return new Response();
    }

    public void timeout(int milliseconds) {
        this.timeout(milliseconds);
    }

    public void maxBodySize(long size) {
        this.maxBodySize(size);
    }

    public void followRedirects(boolean follow) {
        this.followRedirects(follow);
    }

    public String userAgent() {
        return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
    }

    public Document getData(String key) {
        Map<String, String> data = new java.util.HashMap<>();
        for (String text : getUserAgent().split("\r?\n")) {
            if (text.trim().equals(key)) {
                data.put(text, null);
            }
        }
        return new Document(data);
    }

    public Request connect(String url) {
        ((MockHttpConnection) this).url = url;
        return Jsoup.connect(url).userAgent(this.userAgent()).timeout((int) this.timeout());
    }

    private void timeout(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static class Request {
        private String url;

        public Request(String url) {
            this.url = url;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Request that = (Request) o;
            return Objects.equals(url, that.url);
        }
    }

    public static class Response {
        private String data;

        public Response(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Response that = (Response) o;
            return Objects.equals(data, that.data);
        }
    }

    public static class Document {
        private Map<String, String> data;

        public Document(Map<String, String> data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Document that = (Document) o;
            for (Map.Entry<String, String> entry : data.entrySet()) {
                if (!that.data.containsKey(entry.getKey()) || !entry.getValue().equals(that.data.get(entry.getKey())))
                    return false;
            }
            return true;
        }

        public Map<String, String> getData(String key) {
            return new java.util.HashMap<>(data).get(key);
        }

        @Override
        public int hashCode() {
            return data.hashCode();
        }
    }
}

class DocumentTest {
    private static final String DOCUMENT_KEY = "key";

    @Test
    public void testDataAsMap() {
        MockHttpConnection mock = new MockHttpConnection();
        Response response = (Response) mock.connect("http://www.example.com").data(DOCUMENT_KEY);
        assertEquals(Collections.singletonMap(DOCUMENT_KEY, "Hello, World!"), response.getData(DOCUMENT_KEY));
    }

}