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

public class GeneratedGetNullValue_ReturnsNull {

    @Test
    public void getNullValue_ReturnsNull() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute();
        attribute.setValue(null);
        assertSame(attribute, attributes.get(attribute.getKey()));
    }

}