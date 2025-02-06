package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedBasicWithImages_addsDefaultTagsAndImages {

    @Test
    public void basicWithImages_addsDefaultTagsAndImages() {
        Set<String> tags = new HashSet<>();
        tags.add("img");
        Safelist s = Safelist.basicWithImages();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertEquals(2, s.getEnforcedAttributes("tag").size());
    }

}