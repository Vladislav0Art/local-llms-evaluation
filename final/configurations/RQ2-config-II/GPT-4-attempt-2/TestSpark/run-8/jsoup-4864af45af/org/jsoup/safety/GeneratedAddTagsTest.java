package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1"));
        assertTrue(safelist.isSafeTag("tag2"));
    }

}