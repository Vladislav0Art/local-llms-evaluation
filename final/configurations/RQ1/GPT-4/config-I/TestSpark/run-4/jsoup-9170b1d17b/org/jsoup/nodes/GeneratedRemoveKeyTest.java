package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveKeyTest {

    @Test
    public void removeKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertEquals(false, attributes.hasKey("key"));
    }

}