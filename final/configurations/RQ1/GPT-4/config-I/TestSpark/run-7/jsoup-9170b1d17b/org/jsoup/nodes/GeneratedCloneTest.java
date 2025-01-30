package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes original = new Attributes();
        original.add("key", "value");

        Attributes cloned = original.clone();

        assertEquals(cloned, original);
        assertNotSame(cloned, original);
    }

}