package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes original = new Attributes();
        original.add("test", "value");
        Attributes clone = original.clone();
        assertTrue(clone.equals(original));
    }

}