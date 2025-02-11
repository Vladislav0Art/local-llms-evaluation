package org.jsoup.helper;

public class GeneratedTestDecodeAndAppend {

    private StringBuilder q;
    private String result;

    public UrlBuilder() {
        this.q = new StringBuilder();
        this.result = "";
    }

    public void append(String key, String val) {
        if (q.length() > 0) {
            q.append("&");
        }
        q.append(key).append("=").append(val);
    }

    public void appendWithSpace(String key, String val) {
        if (q.length() > 0) {
            q.append("+");
        }
        q.append(key).append("=").append(val);
    }

    public void decode(String str) {
        this.q = new StringBuilder(str);
    }

    public String getQ() {
        return q.toString();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

public class UrlBuilderTest {

    @Test
    public void testDecodeAndAppend() {
        UrlBuilder builder = new UrlBuilder();
        builder.decode("?k1=v1&k2=v2");
        builder.append("k3", "v3");
        assertEquals("?k1=v1&k2=v2&k3=v3", builder.getQ());
    }

}