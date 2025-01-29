package org.jsoup.safety;

public class GeneratedBasicWithImagesPreservesLinksIsSafe {

    @Test
    public void basicWithImagesPreservesLinksIsSafe() {
        Safelist safelist = Safelist.basicWithImages().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
    }

}