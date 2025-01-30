package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.removeIgnoreCase("KEY");
        assertFalse(attrs.hasKey("key"));
    }

}