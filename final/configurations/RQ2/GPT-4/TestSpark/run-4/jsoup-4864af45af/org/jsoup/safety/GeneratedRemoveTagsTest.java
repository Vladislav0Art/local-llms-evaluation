package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    // Test None Safelist

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("div", "a", "img");
        assertFalse(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

}