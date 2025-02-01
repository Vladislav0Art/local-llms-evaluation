package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Node node = new TextNode("content");
        builder.currentElement().appendChild(node);

        assertEquals("content", builder.currentElement().text());
    }

}