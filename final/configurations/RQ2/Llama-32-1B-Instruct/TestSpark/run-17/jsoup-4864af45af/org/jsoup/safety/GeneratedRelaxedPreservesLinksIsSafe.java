package org.jsoup.safety;

public class GeneratedRelaxedPreservesLinksIsSafe {

    @Test
    public void relaxedPreservesLinksIsSafe() {
        Safelist safelist = Safelist.relaxed().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert assertFalse (safelist.isSafeAttribute("a", "href"));
        Assert.assertTrue(safelist.isSafeAttribute("img", "src"));
    }

}