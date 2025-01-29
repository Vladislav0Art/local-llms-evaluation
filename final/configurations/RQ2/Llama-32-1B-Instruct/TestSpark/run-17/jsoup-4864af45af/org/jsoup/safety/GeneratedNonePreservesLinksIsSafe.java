package org.jsoup.safety;

public class GeneratedNonePreservesLinksIsSafe {

    @Test
    public void nonePreservesLinksIsSafe() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertFalse(safelist.isSafeAttribute("img", "src"));
    }

}