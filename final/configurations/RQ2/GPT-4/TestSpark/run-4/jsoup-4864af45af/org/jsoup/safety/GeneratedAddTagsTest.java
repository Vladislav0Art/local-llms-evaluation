package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    // Test None Safelist

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div", "a", "img");
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
    }

}