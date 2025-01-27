package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserSettings;
import org.jsoup.parser.ParseError;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeneratedDatasetReturnsMap {

    @Test
    public void datasetReturnsMap() {
        Attributes attributes = new Attributes();
        Map<String, String> result = attributes.dataset();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}