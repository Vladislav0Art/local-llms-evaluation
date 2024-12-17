package org.jsoup.helper;

public class Generated[
UrlBuilder_normalizeRef WithValidRef]

Test {

    @Test
    public void [UrlBuilder_normalizeRef WithValidRef]Test() {
        String ref = "ref=example.com";
        assertEquals("%20ref%3Dexample.com", normalizeRef(ref));
    }

}