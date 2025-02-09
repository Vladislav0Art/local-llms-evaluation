package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Element element = new Element("p");
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("testData", "testValue");
        element.dataset().putAll(dataSet);

        assertEquals("testValue", element.dataset().get("testData"));
    }

}