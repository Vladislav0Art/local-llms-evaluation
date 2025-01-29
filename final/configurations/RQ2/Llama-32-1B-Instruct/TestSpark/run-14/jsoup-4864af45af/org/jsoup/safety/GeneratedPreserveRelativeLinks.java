package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("img"));
    }

}