package org.jsoup.helper;

public class Generated[UrlBuilder]

NormalizeQuery_Test {

    @Test
    public void [UrlBuilder]NormalizeQuery_Test() {
        String q = " query ";
        String expected = "query";
        assertEquals(expected, UrlBuilder.normalizeQuery(q));
    }

}