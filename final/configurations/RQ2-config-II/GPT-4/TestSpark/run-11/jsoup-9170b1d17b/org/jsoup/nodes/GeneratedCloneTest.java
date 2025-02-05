package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        Attributes clonedAttributes = testAttributes.clone();

        assertEquals(testAttributes, clonedAttributes);
    }

}