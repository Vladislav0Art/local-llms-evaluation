package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    // Testing public static methods

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1"));
        assertTrue(safelist.isSafeTag("tag2"));
    }

}