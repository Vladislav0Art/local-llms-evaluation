package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedAdd_AllKeysPresent_InIncomingAttributes {

    @Test
    public void add_AllKeysPresent_InIncomingAttributes() {
        Attributes incomingAttrs = new Attributes();
        Attribute attr1 = new Attribute("test1", "value1");
        Attribute attr2 = new Attribute("test2", "value2");
        incomingAttrs.add(attr1.getKey(), attr1.getValue());
        incomingAttrs.add(attr2.getKey(), attr2.getValue());
        Attributes attrs = new Attributes();
        attrs.addAll(incomingAttrs);
        assertTrue(attrs.hasKey("test1"));
        assertTrue(attrs.hasKey("test2"));
    }

}