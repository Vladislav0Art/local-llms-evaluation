package org.jsoup.safety;

public class GeneratedTestPreserveRelativeLinks {

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = org.jsoup.safety.Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

}