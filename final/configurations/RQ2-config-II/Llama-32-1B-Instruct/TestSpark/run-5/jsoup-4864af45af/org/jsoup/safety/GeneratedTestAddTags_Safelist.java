package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestAddTags_Safelist {

    @Test
    public void testAddTags_Safelist() {
        Safelist safeList = new Safelist();
        safeList.addTags("a", "b", "c");
        assertTrue(safeList.isSafeTag("a"));
        assertTrue(safeList.isSafeTag("b"));
        assertTrue(safeList.isSafeTag("c"));
    }

}