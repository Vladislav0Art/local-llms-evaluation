package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextAddAttributesIsSafeAttributeTest {

    @Test
    public void simpleTextAddAttributesIsSafeAttributeTest() {
        Safelist safelist = Safelist.simpleText().addAttributes("img", "src");
        assertTrue(((Map<String, String>) safelist.getEnforcedAttributes("img")).containsKey("src"));
    }

}