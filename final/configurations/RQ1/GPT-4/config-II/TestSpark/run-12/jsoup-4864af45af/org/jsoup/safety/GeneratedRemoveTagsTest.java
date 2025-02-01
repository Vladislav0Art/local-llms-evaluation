package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
        safelist.removeTags("p", "div");
        assertFalse(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

}