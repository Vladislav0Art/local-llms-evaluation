package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedBasic_removeAttributes {

    @Test
    public void basic_removeAttributes() {
        Set<String> expected = new HashSet<>();
        Safelist s = Safelist.basic();
        for (String tag : new String[]{"img"}) {
            s = s.addEnforcedAttribute(tag, "src", "http://example.com");
        }
        assertEquals(expected, s.removeEnforcedAttribute("img", "src"));
    }

}