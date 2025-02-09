package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes att = new Attributes();
        att.put("data-key", "value");
        Map<String, String> dataSet = att.dataset();
        assertEquals("value", dataSet.get("key"));
    }

}