package org.jsoup.helper;

public class GeneratedTestBuild {

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
    public void testBuild() {
        UrlBuilderImpl urlBuilder = new UrlBuilderImpl();
        String baseUrl = "https://example.com";
        URL expectedUrl = new URL(baseUrl);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}