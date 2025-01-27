package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedPreserveRelativeLinksPreserve {

    @Test
    public void preserveRelativeLinksPreserve() {
        boolean preserve = true;
        Safelist safelist = Safelist.preserveRelativeLinks(preserve).addTags("a", "b");
        boolean isSafeTag = safelist.isSafeTag("a");
        assertTrue(isSafeTag);
    }

}