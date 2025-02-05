package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        attr.remove("key");
        assertFalse(attr.hasKey("key"));
    }

}