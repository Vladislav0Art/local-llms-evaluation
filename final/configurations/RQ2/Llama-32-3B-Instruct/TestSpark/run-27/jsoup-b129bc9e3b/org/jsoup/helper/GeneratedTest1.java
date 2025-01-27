package org.jsoup.helper;

public class GeneratedTest1 {

    private String url;
    private CookieStore cookieStore;

    public static Connection getConnection(String url, Map<String, String> data, Map<String, String> headers) {
        return new Connection(url, data, headers);
    }

    public static Connection getConnection(String url, String body) {
        return new Connection(url, body);
    }

    public static Connection getConnection(String url, CookieStore cookieStore) {
        return new Connection(url, cookieStore);
    }

    public static Connection getConnection(String url, Map<String, String> data, CookieStore cookieStore) {
        return new Connection(url, data, cookieStore);
    }

    public static Connection getConnection(String url, String body, CookieStore cookieStore) {
        return new Connection(url, body, cookieStore);
    }
}

public class Connection {
    private String url;
    private Map<String, String> data;
    private Map<String, String> headers;
    private CookieStore cookieStore;

    public Connection(String url, Map<String, String> data) {
        this.url = url;
        this.data = data;
    }

    public Connection(String url, Map<String, String> data, CookieStore cookieStore) {
        this.url = url;
        this.data = data;
        this.cookieStore = cookieStore;
    }

    public Connection(String url, String body) {
        this.url = url;
        this.body = body;
    }

    public Connection(String url, String body, CookieStore cookieStore) {
        this.url = url;
        this.body = body;
        this.cookieStore = cookieStore;
    }
}

public class CookieStore {
    private Map<String, String> cookies;

    public CookieStore() {
    }

    public CookieStore(Map<String, String> cookies) {
        this.cookies = cookies;
    }

    public static CookieStore createCookieStore(String key, String value) {
        return new CookieStore(Collections.singletonMap(key, value));
    }
}

public class Test {

    @Test
    public void test1() {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection connection = Http.getConnection("http://example.com", data);
        System.out.println(connection.url());
        System.out.println(connection.data());
    }

}