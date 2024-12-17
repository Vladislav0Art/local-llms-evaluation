package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @BeforeClass
    public static void setup() {
        // Initialize mocks here, e.g., using Mockito
        org.mockito.MockitoAnnotations.initMocks(UrlBuilderTest.class);
    }

    public UrlBuilder getURLBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

}