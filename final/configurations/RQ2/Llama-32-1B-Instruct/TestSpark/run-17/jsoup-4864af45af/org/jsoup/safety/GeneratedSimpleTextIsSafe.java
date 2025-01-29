package org.jsoup.safety;

public class GeneratedSimpleTextIsSafe {

    @Test
    public void simpleTextIsSafe() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "src"));
    }

}