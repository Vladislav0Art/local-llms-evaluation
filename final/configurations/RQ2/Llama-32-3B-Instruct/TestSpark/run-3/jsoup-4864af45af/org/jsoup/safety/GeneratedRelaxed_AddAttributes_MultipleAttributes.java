package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRelaxed_AddAttributes_MultipleAttributes {

    @Test
    public void relaxed_AddAttributes_MultipleAttributes() {
        Safelist relaxed = Safelist.relaxed();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt");
        expectedAttributes.add("title");
        expectedAttributes.add("data-src");
        relaxed = relaxed.addAttributes("img", "alt", "description", "href");
        assertTrue(relaxed.isSafeAttribute("img", null, new Attribute()));
        assertEquals(3, relaxed.getEnforcedAttributes("img").size());
    }

}