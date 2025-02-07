package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestRelaxed_SafeList {

    @Test
    public void testRelaxed_SafeList() {
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.isSafeTag("a"));
        assertFalse(safeList.isSafeAttribute("href", ""));
    }

}