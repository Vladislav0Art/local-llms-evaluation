package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestEquals {

    private static String tagName = "tag1";
    private int hashCode1, hashCode2;

    @Before
    public void init() {
        this.hashCode1 = System.identityHashCode(tagName);
        this.hashCode2 = System.identityHashCode(tagName + "_version");
    }

    @Test
    public void testEquals() {
        Tag tag1 = new Tag(tagName);
        Tag tag2 = new Tag(tagName);

        assertTrue(assertEquals(hashCode1, hashCode2));
        assertFalse(!assertEquals(hashCode1, hashCode2));
    }

}