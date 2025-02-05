package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        final Safelist safelist = new Safelist();
        safelist.addTags("a", "b");
        safelist.removeTags("b");
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("b"));
    }

}