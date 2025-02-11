package org.jsoup.helper;

public class GeneratedTestKeyVal {

    private String key;
    private String value;

    public static KeyVal create(String key, String value) {
        KeyVal kv = new KeyVal();
        kv.key = key;
        kv.value = value;
        return kv;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public boolean hasInputStream() {
        return false;
    }
}

public class Request {
    private List<KeyVal> data = new ArrayList<>();

    public void add(KeyVal keyVal) {
        data.add(keyVal);
    }

    public List<KeyVal> getData() {
        return data;
    }
}

public class Response {
    private int statusCode;
    private String body;

    public Response(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}

public class HttpStatus {
    public static final int OK = 200;
}

public class TestConnection {

    @Test
    public void testKeyVal() throws Exception {
        Request request = new Request();
        KeyVal keyVal = KeyVal.create("key", "value");
        request.getData().add(keyVal);
        assertEquals(KeyVal.class, keyVal.getClass());
    }

}