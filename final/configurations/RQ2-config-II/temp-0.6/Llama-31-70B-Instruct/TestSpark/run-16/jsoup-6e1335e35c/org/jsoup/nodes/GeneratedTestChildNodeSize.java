package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestChildNodeSize {

    @Test
    public void testChildNodeSize() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertEquals(0, element.childNodeSize());
    }

}