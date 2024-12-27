package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestHasAttributes {

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasAttributes());
    }

}