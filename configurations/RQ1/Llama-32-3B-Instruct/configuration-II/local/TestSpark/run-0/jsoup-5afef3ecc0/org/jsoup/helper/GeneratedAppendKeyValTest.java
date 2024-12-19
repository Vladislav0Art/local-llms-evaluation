package org.jsoup.helper;

public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        this.urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
    }

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        URL urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
        String expected = "http://example.com/path?query=value&key%3Dvalue";
        assertEquals(expected, urlBuilder.build().toString());
    }

}