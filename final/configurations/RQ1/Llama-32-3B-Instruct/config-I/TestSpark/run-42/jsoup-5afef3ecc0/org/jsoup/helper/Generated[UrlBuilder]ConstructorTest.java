package org.jsoup.helper;

public class Generated[UrlBuilder]

ConstructorTest {

    @Test
    public void [UrlBuilder]ConstructorTest() {
        URL inputUrl = new URL("http://example.com/path?query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.u);
        assertNull(urlBuilder.q);
    }

}