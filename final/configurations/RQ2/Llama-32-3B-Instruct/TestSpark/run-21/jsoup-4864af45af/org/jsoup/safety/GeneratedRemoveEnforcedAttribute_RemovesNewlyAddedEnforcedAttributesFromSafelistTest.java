package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveEnforcedAttribute_RemovesNewlyAddedEnforcedAttributesFromSafelistTest {

    @Test
    public void removeEnforcedAttribute_RemovesNewlyAddedEnforcedAttributesFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.removeEnforcedAttribute("img", "data-src");
        assertNull((Attribute) new Attributes().add("data-src"));
    }

}