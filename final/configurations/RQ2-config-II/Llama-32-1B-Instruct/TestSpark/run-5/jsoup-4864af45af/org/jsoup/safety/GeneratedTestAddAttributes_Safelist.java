package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestAddAttributes_Safelist {

    @Test
    public void testAddAttributes_Safelist() {
        Safelist safeList = new Safelist();
        safeList.addAttributes("style", "color: red; background-color: blue;");
        assertTrue(safeList.getEnforcedAttributes("style").size() == 1);
        assertTrue(safeList.getEnforcedAttributes("background-color").size() == 1);
    }

}