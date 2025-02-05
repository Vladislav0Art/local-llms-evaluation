package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.add("key2", "value2");
        attrs1.addAll(attrs2);
        assertTrue(attrs1.hasKey("key1"));
        assertTrue(attrs1.hasKey("key2"));
    }

}