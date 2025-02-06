package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRelaxed_addsDefaultAndCommonTags {

    @Test
    public void relaxed_addsDefaultAndCommonTags() {
        Set<String> tags = new HashSet<>();
        tags.add("img");
        Safelist s = Safelist.relaxed();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertEquals(2, s.getEnforcedAttributes("tag").size());
    }

}