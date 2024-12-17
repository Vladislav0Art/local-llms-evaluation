package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyMap {

}

/**
 * Test for UrlBuilder[appendKeyVal][Test].
 */
public class UrlBuilderAppendKeyValTest {

    @Test
    public void testAppendKeyVal_EmptyMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(null);
        assertEquals(null, urlBuilder.getU());
    }

}