package org.jsoup.helper;

public class GeneratedNormalizeQueryReplacesSpacesWithPlusSigns {

    @Test
    public void normalizeQueryReplacesSpacesWithPlusSigns() {
        assertEquals("+a%3D1%26b%3D2", UrlBuilder.normalizeQuery(" a=1&b=2 "));
    }

}