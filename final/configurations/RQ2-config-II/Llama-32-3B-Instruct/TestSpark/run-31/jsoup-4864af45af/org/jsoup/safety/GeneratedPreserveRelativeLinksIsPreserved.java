package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedPreserveRelativeLinksIsPreserved {

    @Test
    public void preserveRelativeLinksIsPreserved() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

}