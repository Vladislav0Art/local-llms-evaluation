package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRemoveTags_removesTags {

    @Test
    public void removeTags_removesTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = new Safelist();
        s.addTags(tags);
        assertTrue(s.removeTags(tags));
        assertFalse(s.removeTags(tags));
    }

}