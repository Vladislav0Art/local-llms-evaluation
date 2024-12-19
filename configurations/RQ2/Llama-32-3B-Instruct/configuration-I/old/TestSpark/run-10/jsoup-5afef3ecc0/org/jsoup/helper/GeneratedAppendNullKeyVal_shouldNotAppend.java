package org.jsoup.helper;

public class GeneratedAppendNullKeyVal_shouldNotAppend {

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
    public void appendNullKeyVal_shouldNotAppend() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = null;
        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();
        Map<String, String> queryMap = parseQueryString(url.toString());
        assertThat(queryMap.size(), is(0));
    }

}