package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedNone_isEmpty {

    @Test
    public void none_isEmpty() {
        Set<String> tags = new HashSet<>();
        Set<String> attributes = new HashSet<>();
        Set<String> protocols = new HashSet<>();

        Safelist s = Safelist.none();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertTrue(s.getEnforcedAttributes("tag").isEmpty());
        assertTrue(s.addProtocols("tag", "attribute", protocols));
        assertFalse(s.removeProtocols("tag", "attribute", protocols));
    }

}