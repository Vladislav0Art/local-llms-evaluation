package org.jsoup.helper;

public class GeneratedBuildUrl_ValidInput_ReturnsValidUrl {

    private UrlBuilder urlBuilder;

    @BeforeClass
    public static void setup() {
        // Initialize mocks here
    }

    public UrlBuilder getURLBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void buildUrl_ValidInput_ReturnsValidUrl() {
        String url = "https://example.com";
        when(urlBuilder.inputUrl.toString()).thenReturn(url);
        URL result = urlBuilder.build();
        assertEquals(url, result.toString());
    }

}