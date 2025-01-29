package org.jsoup.safety;

public class GeneratedRelaxedWithImagesPreservesLinksIsSafe {

    @Test
    public void relaxedWithImagesPreservesLinksIsSafe() {
        Safelist safelist = Safelist.relaxed().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
    }

}