package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "br");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("img"));
    }

}