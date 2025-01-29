package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestAddEnforcedAttribute {

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safelist = new Safelist().simpleText();
        safelist.addEnforcedAttribute("img", "src", "/image.jpg");
        assertTrue(Safelist.simpleText().isSafeTag("img"));
    }

}