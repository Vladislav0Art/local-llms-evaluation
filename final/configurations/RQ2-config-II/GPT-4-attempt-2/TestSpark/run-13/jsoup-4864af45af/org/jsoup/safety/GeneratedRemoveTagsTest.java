package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.basic();

        assertTrue(safelist.isSafeTag("a"));
        safelist.removeTags("a");

        assertFalse(safelist.isSafeTag("a"));
    }

}