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

public class GeneratedHtmlEmptyString_ReturnsEmptyString {

    @Test
    public void htmlEmptyString_ReturnsEmptyString() {
        Attributes attributes = new Attributes();
        StringBuilder builder = new StringBuilder();
        Document.OutputSettings settings = null;
        try {
            attributes.html(builder, settings);
            assertEquals("", builder.toString());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

}