package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedAddTagsTest {

    private Safelist safelist;

    @Test
    public void addTagsTest() {
        safelist = new Safelist();
        safelist.addTags("p", "h1");
        assertTrue(safelist.isSafeTag(Tag.valueOf("p").getName()));
        assertTrue(safelist.isSafeTag(Tag.valueOf("h1").getName()));
    }

}