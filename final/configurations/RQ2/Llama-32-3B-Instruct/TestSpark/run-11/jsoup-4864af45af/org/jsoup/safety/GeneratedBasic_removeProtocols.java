package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedBasic_removeProtocols {

    @Test
    public void basic_removeProtocols() {
        Set<String> expected = new HashSet<>();
        Safelist s = Safelist.basic();
        for (String tag : new String[]{"a"}) {
            s = s.addEnforcedAttribute(tag, "href", "https://example.com");
        }
        assertEquals(expected, s.removeProtocols("a", "href", new String[]{}));
    }

}