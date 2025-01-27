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

public class GeneratedAddAllAttributesFromOtherAttribute_ReturnsUpdatedAttributes {

    @Test
    public void addAllAttributesFromOtherAttribute_ReturnsUpdatedAttributes() {
        Attributes attributes1 = new Attributes();
        Attribute attribute1 = new Attribute("key1", "value1");
        Attributes attributes2 = new Attributes();
        Attribute attribute2 = new Attribute("key2", "value2");
        attributes2.addAll(attributes1);
        assertEquals(2, attributes2.size());
    }

}