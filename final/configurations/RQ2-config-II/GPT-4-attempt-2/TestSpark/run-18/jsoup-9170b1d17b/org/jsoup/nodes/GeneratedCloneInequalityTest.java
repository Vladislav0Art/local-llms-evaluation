package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedCloneInequalityTest {

    @Test
    public void cloneInequalityTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = attrs1.clone();
        attrs2.put("key2", "value2");
        assertNotEquals(attrs1, attrs2);
    }

}