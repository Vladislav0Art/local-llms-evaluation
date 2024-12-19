package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithNoQ {

    private UrlBuilder urlBuilder;

    @Before
    void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyVal_WithNoQ() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        urlBuilder.appendKeyVal(Connection.KeyVal.empty());
        assertEquals(StringUtil.releaseBuilder(sb), urlBuilder.build());
    }

}