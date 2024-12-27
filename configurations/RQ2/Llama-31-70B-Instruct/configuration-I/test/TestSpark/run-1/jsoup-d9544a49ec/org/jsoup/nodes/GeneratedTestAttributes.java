package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAttributes {

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        Attributes attributes = element.attributes();
        assertNotNull(attributes);
        assertTrue(attributes.isEmpty());
    }

}