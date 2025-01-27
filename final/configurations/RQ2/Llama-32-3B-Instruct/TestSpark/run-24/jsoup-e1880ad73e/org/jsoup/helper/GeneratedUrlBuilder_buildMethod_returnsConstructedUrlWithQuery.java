package org.jsoup.helper;

public class GeneratedUrlBuilder_buildMethod_returnsConstructedUrlWithQuery {

    @Test
    public void urlBuilder_buildMethod_returnsConstructedUrlWithQuery() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL constructedUrl = urlBuilder.build();
        assertEquals(URLEncoder.encode("a=1&b=2", DataUtil.UTF_8), URLEncoder.encode(urlBuilder.appendKeyVal(Connection.KeyVal.of("a", "1")).appendKeyVal(Connection.KeyVal.of("b", "2")).encode(), DataUtil.UTF_8));
    }

}