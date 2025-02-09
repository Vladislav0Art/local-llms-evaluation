package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedCloneEqualityTest {

    @Test
    public void cloneEqualityTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = attrs1.clone();
        assertEquals(attrs1, attrs2);
    }

}