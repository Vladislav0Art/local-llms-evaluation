package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeName_returnsNodeNameCorrectly {

    @Test
    public void nodeName_returnsNodeNameCorrectly() {
        Document document = new Document("http://example.com");
        Tag tag = (Tag) document.createElement("div");
        assertEquals("DIV", document.nodeName());
    }

}