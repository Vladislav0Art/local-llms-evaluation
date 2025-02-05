package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedGetInvalidKeyTest {

    @Test
    public void getInvalidKeyTest() {
        Attributes attrs = new Attributes();

        assertNull(attrs.get("key"));
    }

}