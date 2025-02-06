package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_preservesLinks {

    @Test
    public void preserveRelativeLinks_preservesLinks() {
        Set<String> tags = new HashSet<>();
        Element img = new Element();
        img.attr("src", "https://example.com");
        Safelist s = new Safelist(Safelist.relaxed());
        assertTrue(s.preserveRelativeLinks(true));
        assertEquals("https://example.com", s.getEnforcedAttributes("img").attr("src"));
    }

}