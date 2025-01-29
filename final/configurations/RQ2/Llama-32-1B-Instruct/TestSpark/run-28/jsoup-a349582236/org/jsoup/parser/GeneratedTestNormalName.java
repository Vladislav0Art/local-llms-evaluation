package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestNormalName {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testNormalName() {
        assertEquals("Tag", Normalizer.normalize(tag.getName(), Normalizer.NFD));
    }

}