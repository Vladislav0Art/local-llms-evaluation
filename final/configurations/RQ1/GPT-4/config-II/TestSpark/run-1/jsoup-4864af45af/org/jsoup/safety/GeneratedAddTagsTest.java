package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        String tag = "p";
        safelist.addTags(tag);
        assertTrue(safelist.isSafeTag(tag));
    }

}