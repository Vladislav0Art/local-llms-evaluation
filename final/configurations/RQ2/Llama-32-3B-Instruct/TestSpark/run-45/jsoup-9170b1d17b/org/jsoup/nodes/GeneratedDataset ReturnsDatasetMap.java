package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedDataset ReturnsDatasetMap {

    @Test
    public void dataset

    ReturnsDatasetMap() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        assertEquals(1, ((Map) attributes.dataset()).size());
    }

}