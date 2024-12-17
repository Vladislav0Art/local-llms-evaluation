package org.jsoup.helper;

public class GeneratedAppendUrlShouldAppend {

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
    public void appendUrlShouldAppend() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL urlToAppend = new URL("https://another.com");
        urlBuilder.appendUrl(urlToAppend.toString());
        URL finalUrl = urlBuilder.build();
        assertThat(finalUrl, is(new URL(inputUrl.toString() + urlToAppend.toString())));
    }

    private Map<String, String> parseQueryString(String queryString) {
        String[] params = queryString.split("&");
        Map<String, String> queryMap = new HashMap<>();
        for (String param : params) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2) {
                queryMap.put(keyValue[0], keyValue[1]);
            }
        }
        return queryMap;
    }

}