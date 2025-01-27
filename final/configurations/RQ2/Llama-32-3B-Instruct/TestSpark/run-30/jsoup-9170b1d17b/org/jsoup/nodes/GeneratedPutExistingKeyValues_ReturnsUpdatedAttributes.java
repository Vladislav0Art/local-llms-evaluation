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

public class GeneratedPutExistingKeyValues_ReturnsUpdatedAttributes {

    @Test
    public void putExistingKeyValues_ReturnsUpdatedAttributes() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        attributes.put(attribute.getKey(), attribute.getValue());
        assertEquals(1, attributes.size());
    }

}