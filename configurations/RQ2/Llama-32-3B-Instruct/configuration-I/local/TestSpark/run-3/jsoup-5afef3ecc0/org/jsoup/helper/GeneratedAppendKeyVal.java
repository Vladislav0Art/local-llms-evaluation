package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal() {
        List<Connection.KeyVal> values = Arrays.asList(new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2"));
        urlBuilder.appendKeyVal(values);
    }

}