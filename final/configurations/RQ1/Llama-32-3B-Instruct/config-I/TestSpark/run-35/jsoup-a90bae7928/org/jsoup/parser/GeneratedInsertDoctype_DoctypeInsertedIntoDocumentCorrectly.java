package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.jsoup.helper.Validate.validate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertDoctype_DoctypeInsertedIntoDocumentCorrectly {

    private XmlTreeBuilder xmlTreeBuilder;
    @Mock
    private Parser parser;
    @Mock
    private Element currentElement;
    private List<Node> stack = new ArrayList<>();
    private Document doc;
    private ParseSettings settings;

    @Before
    public void setup() {
        xmlTreeBuilder = new XmlTreeBuilder();
        settings = xmlTreeBuilder.defaultSettings();
        when(parser.settings()).thenReturn(settings);
        stack.add(doc = new Document());
        stack.add(new Element("a"));
        currentElement = stack.get(stack.size() - 1);
    }

    @Test
    public void insertDoctype_DoctypeInsertedIntoDocumentCorrectly() {
        Token token = new Token();
        xmlTreeBuilder.insert(token);
        assertTrue(doc.hasChild("doctype"));
    }

}