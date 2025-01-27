package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedPreserveRelativeLinksDoNotPreserve {

    @Test
    public void preserveRelativeLinksDoNotPreserve() {
        boolean preserve = false;
        Safelist safelist = Safelist.preserveRelativeLinks(preserve).addTags("a", "b");
        boolean isSafeTag = safelist.isSafeTag("c");
        assertFalse(isSafeTag);
    }
}

}