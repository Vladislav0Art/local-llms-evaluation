package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_SimpleTextSafelist {

    @Test
    public void simpleText_SimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.getEnforcedAttributes("p").containsKey(Validate.ATTR_TEXT));
    }

}