package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedBasic_addProtocols {

    @Test
    public void basic_addProtocols() {
        Set<String> expected = new HashSet<>(Set.of("https", "ftp"));
        Safelist s = Safelist.basic();
        for (String tag : new String[]{"a"}) {
            s = s.addEnforcedAttribute(tag, "href", "https://example.com");
        }
        assertEquals(expected, s.getEnforcedAttributes("a").keySet());
    }

}