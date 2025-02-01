package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "div");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("span"));
    }

}