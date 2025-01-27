package org.jsoup.helper;

public class GeneratedTest {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public class RequestBody {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class Data {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class HttpRequestTest {

    @Test
    public void testRequestUrl() {
        HttpRequest request = new HttpRequest();
        request.setUrl("https://example.com");
        assertEquals("https://example.com", request.getUrl());
    }

    @Test
    public void testRequestBody() {
        RequestBody requestBody = new RequestBody();
        requestBody.setValue("Hello, World!");
        assertEquals("Hello, World!", requestBody.getValue());
    }

    @Test
    public void testRequestCharset() {
        HttpRequest request = new HttpRequest();
        request.setPostDataCharset("UTF-8");
        assertEquals("UTF-8", request.getPostDataCharset());
    }

    @Test
    public void testData() {
        Data data = new Data();
        data.setKey("Key");
        data.setValue("Value");
        assertEquals("Key", data.getKey());
        assertEquals("Value", data.getValue());
    }

}