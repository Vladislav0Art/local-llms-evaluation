package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedBasic_addsDefaultTags {

    @Test
    public void basic_addsDefaultTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = Safelist.basic();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertEquals(3, s.getEnforcedAttributes("tag").size());
    }

}