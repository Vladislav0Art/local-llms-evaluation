package org.jsoup.helper;

public class GeneratedTestBuildUrlWithFragment {

    private String base;

    public UrlBuilder(String base) {
        this.base = base;
    }

    public void addQueryParameter(String key, String value) {
        if (base.contains("?")) {
            base += "&" + key + "=" + value;
        } else {
            base += "?" + key + "=" + value;
        }
    }

    public String build() {
        return base;
    }
}

public class UrlBuilderTest {

    @Test
    public void testBuildUrlWithFragment() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        urlBuilder.addQueryParameter("key", "value");
        urlBuilder.addQueryParameter("fragmentKey", "fragmentValue");
        assertEquals("https://example.com?key=value#fragmentKey=fragmentValue", urlBuilder.build());
    }

}