package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAttributes {

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertNotNull(element.attributes());
    }

}