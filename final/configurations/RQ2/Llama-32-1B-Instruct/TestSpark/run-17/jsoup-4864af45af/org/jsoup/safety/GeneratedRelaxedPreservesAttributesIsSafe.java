package org.jsoup.safety;

public class GeneratedRelaxedPreservesAttributesIsSafe {

    @Test
    public void relaxedPreservesAttributesIsSafe() {
        Safelist safelist = Safelist.relaxed().preserveRelativeLinks(true);
        Safelist safelistCopy = new Safelist();
        safelistCopy.addAttributes("a", "href");
        Assert.assertFalse(safelist.isSafeAttribute("a", "href"));
        Assert.assertTrue(safelistCopy.isSafeAttribute("a", "href"));
    }

}