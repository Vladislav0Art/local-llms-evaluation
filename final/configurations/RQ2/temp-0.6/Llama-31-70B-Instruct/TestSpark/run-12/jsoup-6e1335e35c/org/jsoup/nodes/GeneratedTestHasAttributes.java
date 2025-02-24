package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestHasAttributes {

    // Test case for #hasChildNodes()

    @Test
    public void testHasAttributes() {
        Element element = new Element("p");
        assertFalse(element.hasAttributes());
        element.attr("id", "element-id");
        assertTrue(element.hasAttributes());
    }

}