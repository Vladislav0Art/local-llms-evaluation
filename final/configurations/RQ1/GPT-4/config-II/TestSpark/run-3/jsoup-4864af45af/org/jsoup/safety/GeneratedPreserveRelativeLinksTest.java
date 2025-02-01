package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void PreserveRelativeLinksTest() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.preserveRelativeLinks);
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks);
    }

}