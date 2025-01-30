package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetMissingKeyTest {

    @Test
    public void getMissingKeyTest() {
        Attributes attributes = new Attributes();
        String result = attributes.get("missing-key");
        assertEquals("", result);
    }

}