package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestRemoveEnforcedAttribute_Safelist {

    @Test
    public void testRemoveEnforcedAttribute_Safelist() {
        Safelist safeList = new Safelist();
        safeList.removeEnforcedAttribute("a", "href");
        assertFalse(safeList.isSafeAttribute("a", "href"));
    }

}