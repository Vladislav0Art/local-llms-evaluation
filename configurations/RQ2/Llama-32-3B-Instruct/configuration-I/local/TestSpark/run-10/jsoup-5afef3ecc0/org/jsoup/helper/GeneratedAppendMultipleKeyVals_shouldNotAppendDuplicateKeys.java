package org.jsoup.helper;

public class GeneratedAppendMultipleKeyVals_shouldNotAppendDuplicateKeys {

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
    public void appendMultipleKeyVals_shouldNotAppendDuplicateKeys() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key1", "value2");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        URL url = urlBuilder.build();
        Map<String, String> queryMap = parseQueryString(url.toString());
        assertThat(queryMap.size(), is(1));
        assertThat(queryMap.get("key1"), is("value2"));
    }

}