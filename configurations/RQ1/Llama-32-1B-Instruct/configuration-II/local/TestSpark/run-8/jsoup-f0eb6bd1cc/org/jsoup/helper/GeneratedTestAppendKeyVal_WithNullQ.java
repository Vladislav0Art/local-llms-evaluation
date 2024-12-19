package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithNullQ {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_WithNullQ() throws UnsupportedEncodingException {
        String q = null;
        urlBuilder.q = StringUtil.borrowBuilder();
        assertEquals("key%3Dvalue", urlBuilder.build().toString());
    }

}