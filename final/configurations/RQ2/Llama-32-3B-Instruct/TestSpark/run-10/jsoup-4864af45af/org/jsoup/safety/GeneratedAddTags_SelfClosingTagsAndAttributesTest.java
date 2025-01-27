package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddTags_SelfClosingTagsAndAttributesTest {

    @Test
    public void addTags_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addTags("img", "br");
        assertTrue(safelist.isSafeTag("/img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

}