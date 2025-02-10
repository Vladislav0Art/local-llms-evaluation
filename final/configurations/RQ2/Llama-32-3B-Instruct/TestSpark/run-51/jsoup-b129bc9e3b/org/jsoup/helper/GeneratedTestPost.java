package org.jsoup.helper;

public class GeneratedTestPost {

    @Test
    public void testPost() throws Exception {
        String url = "http://example.com";
        StringBuilder data = new StringBuilder("key=value");
        String[] headers = {"Content-Type: application/x-www-form-urlencoded"};
        Jsoup.Request request = new Jsoup.Request(url, (requestBuilder) -> {
            requestBuilder.method(Jsoup.Method.POST);
            return requestBuilder;
        }, data.toString(), "application/x-www-form-urlencoded", headers);
        Document document = request.execute();
        System.out.println(document.html());
    }
}

public class Jsoup {

    public static class Request {
        private String url;
        private Method method;
        private StringBuilder data;
        private String headers;

        public Request(String url, Method method, String data, String headers) {
            this.url = url;
            this.method = method;
            this.data = new StringBuilder(data);
            this.headers = headers;
        }

        public Document execute() throws Exception {
            return Jsoup.connect(url).method(method.get()).data(data.toString()).headers(headers).get();
        }
    }

    @FunctionalInterface
    public interface Method {
        String get();

        default String post() {
            return "POST";
        }
    }

    public static class Document {
        private String html;

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }
    }

    public static Connection connect(String url) {
        return new Connection(url);
    }
}

public class Connection {

    private String url;

    public Connection(String url) {
        this.url = url;
    }

    public Jsoup.Request request(Method method, String data, String headers) {
        return new Jsoup.Request(url, method, data, headers);
    }

}