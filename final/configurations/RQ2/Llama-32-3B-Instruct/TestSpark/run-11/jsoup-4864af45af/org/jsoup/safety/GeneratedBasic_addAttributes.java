package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedBasic_addAttributes {

    @Test
    public void basic_addAttributes() {
        Set<String> expected = new HashSet<>(Set.of("src"));
        Safelist s = Safelist.basic();
        for (String tag : new String[]{"img"}) {
            s = s.addEnforcedAttribute(tag, "src", "http://example.com");
        }
        assertEquals(expected, s.getEnforcedAttributes("img").keySet());
    }

}