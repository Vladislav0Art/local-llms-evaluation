package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedAddAttributes_AddedAttributePreservesAttrValueTest {

    @Test
    public void addAttributes_AddedAttributePreservesAttrValueTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt", "123");
        Safelist newSafelist = safelist.addAttributes(expectedAttributes);
        assertEquals(123L, (long) newSafelist.getEnforcedAttributes("img").get("alt"));
    }

}