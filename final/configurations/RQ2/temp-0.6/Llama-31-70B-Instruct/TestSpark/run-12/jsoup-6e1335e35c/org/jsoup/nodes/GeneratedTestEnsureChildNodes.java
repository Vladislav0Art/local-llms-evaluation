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

public class GeneratedTestEnsureChildNodes {

    // Test case for #hasChildNodes()

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element("p");
        assertTrue(element.ensureChildNodes().isEmpty());
        element.appendChild(new Element("span"));
        assertEquals(1, element.ensureChildNodes().size());
    }

}