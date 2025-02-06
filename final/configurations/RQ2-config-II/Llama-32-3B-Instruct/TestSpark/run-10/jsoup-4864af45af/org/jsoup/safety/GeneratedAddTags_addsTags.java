package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedAddTags_addsTags {

    @Test
    public void addTags_addsTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = new Safelist();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
    }

}