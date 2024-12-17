package org.jsoup.helper;

public class GeneratedBuildUrl_InvalidInput_ThrowsException {

    private UrlBuilder urlBuilder;

    @BeforeClass
    public static void setup() {
        // Initialize mocks here
    }

    public UrlBuilder getURLBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void buildUrl_InvalidInput_ThrowsException() {
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
    }

}