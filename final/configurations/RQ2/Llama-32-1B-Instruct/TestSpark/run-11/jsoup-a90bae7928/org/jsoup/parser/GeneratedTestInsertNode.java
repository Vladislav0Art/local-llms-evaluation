package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parseDocument("<root><child></child></root>", null, null);
        Element element = document.getElementById("child");
        builder.insert(element);
        assertEquals(1, element.getChildren().size());
    }

}