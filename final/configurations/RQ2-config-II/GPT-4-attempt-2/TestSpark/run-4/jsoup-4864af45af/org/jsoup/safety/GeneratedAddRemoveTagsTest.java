package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveTagsTest {

    @Test
    public void addRemoveTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1"));
        safelist.removeTags("tag1", "tag2");
        assertFalse(safelist.isSafeTag("tag1"));
    }

}