package org.jsoup.safety;

public class GeneratedTestPreserveRelativeLinksWithoutImages {

    @Test
    public void testPreserveRelativeLinksWithoutImages() {
        Safelist safelist = new Safelist(true);
        assertTrue(safelist.isSafeTag("a"));
    }

}