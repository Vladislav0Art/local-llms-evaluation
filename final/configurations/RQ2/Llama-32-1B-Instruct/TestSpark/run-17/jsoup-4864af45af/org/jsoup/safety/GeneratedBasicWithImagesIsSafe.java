package org.jsoup.safety;

public class GeneratedBasicWithImagesIsSafe {

    @Test
    public void basicWithImagesIsSafe() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.isSafeAttribute("img", "src"));
    }

}