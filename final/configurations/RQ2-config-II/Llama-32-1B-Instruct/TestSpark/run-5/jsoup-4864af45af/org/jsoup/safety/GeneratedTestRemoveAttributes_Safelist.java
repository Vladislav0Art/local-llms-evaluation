package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestRemoveAttributes_Safelist {

    @Test
    public void testRemoveAttributes_Safelist() {
        Safelist safeList = new Safelist();
        safeList.removeAttributes("style", "color: red; background-color: blue;");
        assertFalse(safeList.isSafeAttribute("style", "color: red;"));
        assertFalse(safeList.isSafeAttribute("background-color", "blue;"));
    }

}