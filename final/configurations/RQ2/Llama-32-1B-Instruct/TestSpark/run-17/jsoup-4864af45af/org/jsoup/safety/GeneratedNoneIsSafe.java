package org.jsoup.safety;

public class GeneratedNoneIsSafe {

    @Test
    public void noneIsSafe() {
        Safelist safelist = Safelist.none();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeAttribute("a", "src"));
    }

}