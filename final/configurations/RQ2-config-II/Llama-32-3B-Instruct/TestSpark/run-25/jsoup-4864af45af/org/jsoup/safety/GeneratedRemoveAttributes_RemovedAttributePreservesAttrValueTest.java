package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedRemoveAttributes_RemovedAttributePreservesAttrValueTest {

    @Test
    public void removeAttributes_RemovedAttributePreservesAttrValueTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt", "123");
        Safelist newSafelist = safelist.removeAttributes(expectedAttributes);
        assertEquals(123L, (long) newSafelist.getEnforcedAttributes("img").get("alt"));
    }

}