package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a", "b");
        safelist.removeTags("a");
        assertFalse(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("b"));
    }

}