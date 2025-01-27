package org.jsoup.helper;

public class GeneratedTest {

    private StringBuilder sb;

    public UrlBuilder(String url) throws MalformedURLException {
        this.sb = new StringBuilder();
        sb.append(url);
    }

    public void appendKeyVal(String key, String value) throws UnsupportedEncodingException {
        sb.append(key).append("=").append(URLEncoder.encode(value, "UTF-8")).append("&");
    }

    public URL build() throws MalformedURLException {
        return new URL(sb.toString().trimEnd());
    }
}

@Test
public void newUrlBuilder() {
    assertTrue(new UrlBuilder(null).build().equals(null));
}

@Test
public void build_WorksWithEmptyUrl() {
    UrlBuilder builder = new UrlBuilder(null);
    assertEquals(null, builder.build());
}

@Test
public void appendKeyVal_NoParameters_ThrowsUnsupportedEncodingException() throws UnsupportedEncodingException {
    Connection.KeyVal kv = null;
    try {
        new UrlBuilder(null).appendKeyVal(kv);
        fail("Expected UnsupportedEncodingException");
    } catch (UnsupportedEncodingException e) {
        // Expected
    }
}

}