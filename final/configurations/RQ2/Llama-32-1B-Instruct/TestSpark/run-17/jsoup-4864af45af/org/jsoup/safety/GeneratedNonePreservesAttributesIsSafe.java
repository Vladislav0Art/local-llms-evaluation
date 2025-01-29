package org.jsoup.safety;

public class GeneratedNonePreservesAttributesIsSafe {

    @Test
    public void nonePreservesAttributesIsSafe() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        Safelist safelistCopy = new Safelist();
        safelistCopy.addAttributes("a", "href");
        Assert.assertTrue(safelist.isSafeAttribute("a", "href"));
        Assert.assertFalse(safelistCopy.isSafeAttribute("a", "href"));
    }

}