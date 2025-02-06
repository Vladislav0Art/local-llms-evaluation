package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSimpleTextAddAttributesIsSafe {

    @Test
    public void simpleTextAddAttributesIsSafe() {
        Safelist safelist = Safelist.simpleText();
        safelist.addAttributes("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("alt")));
    }

}