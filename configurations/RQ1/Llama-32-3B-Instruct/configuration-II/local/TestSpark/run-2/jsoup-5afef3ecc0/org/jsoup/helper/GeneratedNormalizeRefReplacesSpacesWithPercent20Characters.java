package org.jsoup.helper;

public class GeneratedNormalizeRefReplacesSpacesWithPercent20Characters {

    @Test
    public void normalizeRefReplacesSpacesWithPercent20Characters() {
        assertEquals("%20ref", UrlBuilder.normalizeRef("  ref "));
    }

}