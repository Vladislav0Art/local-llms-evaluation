package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedPreserveRelativeLinksPreservesLinkFormat {

    @Test
    public void preserveRelativeLinksPreservesLinkFormat() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithRelativeLinks = safelist.preserveRelativeLinks(true);
        assertTrue(safelistWithRelativeLinks.isSafeAttribute(null, null, null));
    }

}