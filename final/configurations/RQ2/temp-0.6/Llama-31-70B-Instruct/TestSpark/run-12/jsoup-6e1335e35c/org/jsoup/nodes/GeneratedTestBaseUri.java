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

public class GeneratedTestBaseUri {

    // Test case for #hasChildNodes()

    @Test
    public void testBaseUri() {
        Element element = new Element("p", "http://example.com");
        assertEquals("http://example.com", element.baseUri());
    }

}