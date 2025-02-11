package org.jsoup.helper;

public class Generated[UrlBuilder]

NormalizeRef_Test {

    @Test
    public void [UrlBuilder]NormalizeRef_Test() {
        String r = "  fragment";
        String expected = "%20fragment";
        assertEquals(expected, UrlBuilder.normalizeRef(r));
    }

}