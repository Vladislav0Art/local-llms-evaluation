package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedPut_AddKeyValue_PresentInAttributes_NoChange {

    @Test
    public void put_AddKeyValue_PresentInAttributes_NoChange() {
        Attributes attrs = new Attributes();
        attrs.put("test", "value");
        assertEquals("value", attrs.get("test"));
    }

}