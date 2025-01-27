package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveAttributes_RemovesNewlyAddedAttributesFromSafelistTest {

    @Test
    public void removeAttributes_RemovesNewlyAddedAttributesFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.removeAttributes("img", "alt");
        assertNull((Attribute) new Attributes().add("alt"));
    }

}