package org.jsoup.helper;

public class GeneratedNewUrlBuilder_WithInputUrl_ReturnsCorrectInstance {

    @Test
    public void newUrlBuilder_WithInputUrl_ReturnsCorrectInstance() {
        URL inputUrl = createMockUrl();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
        assertEquals(inputUrl, urlBuilder.getInputUrl());
    }

}