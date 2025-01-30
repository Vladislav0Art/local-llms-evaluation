package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");

        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("a"));
    }

}