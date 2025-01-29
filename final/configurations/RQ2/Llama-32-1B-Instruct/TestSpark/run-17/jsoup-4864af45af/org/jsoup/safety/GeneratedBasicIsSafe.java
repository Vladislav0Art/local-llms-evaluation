package org.jsoup.safety;

public class GeneratedBasicIsSafe {

    @Test
    public void basicIsSafe() {
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
    }

}