package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestPreserveRelativeLinks {

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = new Safelist().basicWithImages();
        safelist.preserveRelativeLinks(true);
        assertTrue(Safelist.basicWithImages().isSafeTag("img");
    }

}