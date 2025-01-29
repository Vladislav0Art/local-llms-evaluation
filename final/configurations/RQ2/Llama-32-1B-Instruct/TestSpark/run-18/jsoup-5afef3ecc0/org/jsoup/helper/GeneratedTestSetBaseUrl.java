package org.jsoup.helper;

public class GeneratedTestSetBaseUrl {

    private static final String BASE_URL = "https://example.com";
    private URL currentUrl;

    @Override
    public void appendKeyVal(Connection.KeyVal kv) {
        // Implementation
    }

    public void setBaseUrl(String baseUrl) {
        this.BASE_URL = baseUrl;
    }

    @Override
    public URL build() throws UnsupportedEncodingException {
        if (currentUrl == null || !BASE_URL.equals(currentUrl.toString())) {
            currentUrl = new URL(BASE_URL);
            System.out.println("Base URL updated");
        }
        return currentUrl;
    }

    private String encode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}

public class UrlBuilderTest {

    @Test
    public void testSetBaseUrl() {
        UrlBuilderImpl urlBuilder = new UrlBuilderImpl();
        String baseUrl = "";
        urlBuilder.setBaseUrl(baseUrl);
        Assert.assertEquals(baseUrl, urlBuilder.BASE_URL);
    }

}