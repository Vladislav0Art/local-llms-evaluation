package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "div");
        safelist.removeTags("div");
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

}