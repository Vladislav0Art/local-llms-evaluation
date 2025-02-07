package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestSafelistCopy_SafeList {

    @Test
    public void testSafelistCopy_SafeList() {
        Safelist safeList = Safelist.none();
        Safelist copy = new Safelist(safeList);
        assertTrue(copy.isSafeTag("img"));
        assertTrue(copy.isSafeAttribute("style", "color: red;"));
        assertFalse(copy.isSafeAttribute("script", "red;"));
    }

}