package org.jsoup.helper;

public class GeneratedAppendKeyVal_validInput_correctlyFormatted {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void appendKeyVal_validInput_correctlyFormatted() throws UnsupportedEncodingException {
        urlBuilder.q = new StringBuilder();

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);

        assertEquals("key=value", urlBuilder.q.toString());
    }

}