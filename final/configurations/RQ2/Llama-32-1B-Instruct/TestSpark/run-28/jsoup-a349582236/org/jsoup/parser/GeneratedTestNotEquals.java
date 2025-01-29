package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestNotEquals {

    private static String tagName = "tag1";
    private int hashCode1, hashCode2;

    @Before
    public void init() {
        this.hashCode1 = System.identityHashCode(tagName);
        this.hashCode2 = System.identityHashCode(tagName + "_version");
    }

    @Test
    public void testNotEquals() {
        Tag tag1 = new Tag("new_tag");
        Tag tag2 = new Tag(tagName + "_version");

        assertTrue(!assertEquals(hashCode1, hashCode2));
        assertTrue(false != assertEquals(hashCode1, hashCode2));
    }

}