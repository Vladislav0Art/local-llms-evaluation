package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist().addTags("tag1", "tag2", "tag3");
        safelist.removeTags("tag1", "tag3");
        assertFalse(safelist.isSafeTag("tag1"));
        assertFalse(safelist.isSafeTag("tag3"));
    }

}