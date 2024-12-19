package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithQ {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_WithQ() throws UnsupportedEncodingException {
        String q = "key=value";
        urlBuilder.q = StringUtil.borrowBuilder().append(q);
        assertEquals("key%3Dvalue", urlBuilder.build().toString());
    }

}