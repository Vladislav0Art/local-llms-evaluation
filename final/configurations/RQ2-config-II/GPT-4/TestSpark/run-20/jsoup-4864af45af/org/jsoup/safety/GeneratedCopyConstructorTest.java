package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist original = new Safelist().addTags("tag1", "tag2");
        Safelist copy = new Safelist(original);
        assertTrue(copy.isSafeTag("tag1"));
        assertTrue(copy.isSafeTag("tag2"));
    }

}