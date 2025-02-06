package org.jsoup.safety;

public class GeneratedBasicWithImages_SimpleTextAndImages {

    @Test
    public void basicWithImages_SimpleTextAndImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

}