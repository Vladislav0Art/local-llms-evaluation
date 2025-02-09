package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextRemoveAttributesNotSafeAttributeTest {

    @Test
    public void simpleTextRemoveAttributesNotSafeAttributeTest() {
        Safelist safelist = Safelist.simpleText().removeAttributes("script", "style");
        assertFalse(((Map<String, String>) safelist.getEnforcedAttributes("script")).containsKey("style"));
    }

}