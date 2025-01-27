package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedAdd_AddKeyValue_PresentInAttributes {

    @Test
    public void add_AddKeyValue_PresentInAttributes() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("test", "value");
        attrs.add(attr.getKey(), attr.getValue());
        assertTrue(attrs.hasKey(attr.getKey()));
    }

}