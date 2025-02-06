package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedSimpleText_addsNoTags {

    @Test
    public void simpleText_addsNoTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = Safelist.simpleText();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertTrue(s.getEnforcedAttributes("tag").isEmpty());
    }

}