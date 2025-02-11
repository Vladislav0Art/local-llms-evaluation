package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.TextNode;

import java.io.Reader;
import java.util.List;

public class GeneratedPopStackToClose_CallsOnNodeClosed {

    @Test
    public void popStackToClose_CallsOnNodeClosed() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Tag endTag = new Tag("end", null, null);
        final Element element = new Element(endTag);
        assertEquals(0, element.getChildNodes().getLength());
        builder.popStackToClose(element);
        assertNotNull(builder.doc);
    }

}