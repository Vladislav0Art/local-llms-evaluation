package org.jsoup.helper;

public class GeneratedBuild_ReturnsConstructUrl {

    @Test
    public void build_ReturnsConstructUrl() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder();
        URL inputUrl = createMockUrl();
        assertNotNull(inputUrl);
        assertFalse(inputUrl.isEmpty());
        assertEquals(urlBuilder, new UrlBuilder());
    }

}