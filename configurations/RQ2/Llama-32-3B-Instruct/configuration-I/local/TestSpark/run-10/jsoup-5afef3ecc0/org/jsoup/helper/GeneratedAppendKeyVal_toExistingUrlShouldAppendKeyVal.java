package org.jsoup.helper;

public class GeneratedAppendKeyVal_toExistingUrlShouldAppendKeyVal {

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
    public void appendKeyVal_toExistingUrlShouldAppendKeyVal() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();
        Map<String, String> queryMap = parseQueryString(url.toString());
        assertThat(queryMap.size(), is(1));
        assertThat(queryMap.get("key"), is("value"));
    }

}