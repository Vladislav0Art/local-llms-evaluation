package org.jsoup.helper;

public class GeneratedAppendKeyVal_NullKV_ThrowsException {

    private UrlBuilder urlBuilder;

    @BeforeClass
    public static void setup() {
        // Initialize mocks here
    }

    public UrlBuilder getURLBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void appendKeyVal_NullKV_ThrowsException() {
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

}