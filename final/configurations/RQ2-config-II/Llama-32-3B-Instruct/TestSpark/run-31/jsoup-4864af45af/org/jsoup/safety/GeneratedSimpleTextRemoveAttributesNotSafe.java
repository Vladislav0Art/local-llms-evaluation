package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSimpleTextRemoveAttributesNotSafe {

    @Test
    public void simpleTextRemoveAttributesNotSafe() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeAttributes("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("alt")));
    }

}