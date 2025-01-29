package org.jsoup.safety;

public class GeneratedRelaxedIsSafe {

    @Test
    public void relaxedIsSafe() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.isSafeAttribute("a", "href"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "src"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "title"));
    }

}