package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveTags_SelfClosingTagsAndAttributesTest {

    @Test
    public void removeTags_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeTags("script", "font");
        assertTrue(safelist.isSafeTag("/img"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

}