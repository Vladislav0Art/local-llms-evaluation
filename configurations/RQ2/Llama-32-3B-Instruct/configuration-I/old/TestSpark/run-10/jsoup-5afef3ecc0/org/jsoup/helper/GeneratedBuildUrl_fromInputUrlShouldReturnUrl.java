package org.jsoup.helper;

public class GeneratedBuildUrl_fromInputUrlShouldReturnUrl {

    @Mock
    private URL inputUrl;

    @Before
    public void setup() {
        when(inputUrl.toString()).thenReturn("https://example.com");
    }

    @After
    public void tearDown() {
        org.mockito.Mockito.resetAllMocks();
    }

    @Test
    public void buildUrl_fromInputUrlShouldReturnUrl() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertThat(url, is(new URL(inputUrl.toString())));
    }

}