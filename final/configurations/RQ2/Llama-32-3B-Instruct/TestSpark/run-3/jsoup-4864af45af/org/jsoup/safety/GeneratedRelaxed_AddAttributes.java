package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRelaxed_AddAttributes {

    @Test
    public void relaxed_AddAttributes() {
        Safelist relaxed = Safelist.relaxed();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt");
        expectedAttributes.add("title");
        relaxed = relaxed.addAttributes("img", "alt", "description");
        assertTrue(relaxed.isSafeAttribute("img", null, null));
        assertEquals(1, relaxed.getEnforcedAttributes("img").size());
    }

}