package org.jsoup.helper;

public class GeneratedTestUrlBuilder_ConnectsToRemoteUrl {

    @Test
    public void testUrlBuilder_ConnectsToRemoteUrl() {
        URL remoteUrl = "https://example.com/path?a=1&b=2";
        URL actualUrl = new UrlBuilder(remoteUrl).build();
        assertSame(remoteUrl, actualUrl);
    }

}