package org.jsoup.helper;

public class GeneratedNormalizeRef_replacesSpacesWithPercent20Signs {

    @Test
    public void normalizeRef_replacesSpacesWithPercent20Signs() {
        String r = "ref string";
        String expected = "%20ref%20string";
        assertEquals(expected, UrlBuilder.normalizeRef(r));
    }

}