package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestRemoveValue {

    @Test
    public void testRemoveValue() {
        Attributes attrs = new Attributes();
        attrs.remove("test");
        assertTrue(attrs.isEmpty());
    }

}