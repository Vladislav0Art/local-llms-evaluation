package org.jsoup.safety;

public class GeneratedBasic_SimpleTagWithImages {

    @Test
    public void basic_SimpleTagWithImages() {
        Safelist result = new Safelist().basicWithImages();
        assertTrue(result.basicWithImages().isSafeTag("img"));
        assertFalse(result.basicWithImages().isSafeTag("a"));
    }

}