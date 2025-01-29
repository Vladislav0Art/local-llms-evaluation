package org.jsoup.safety;

public class GeneratedRelaxedWithImagesIsSafe {

    @Test
    public void relaxedWithImagesIsSafe() {
        Safelist safelist = Safelist.relaxedWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
        Assert.assertFalse(safelist.isSafeAttribute("img", "href"));
    }

}