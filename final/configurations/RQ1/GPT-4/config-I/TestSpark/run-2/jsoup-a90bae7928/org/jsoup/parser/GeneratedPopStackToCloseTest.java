package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<sample>example</sample>"), "http://sample.com", parser);
        xmlTreeBuilder.runParser();
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "sample";
        xmlTreeBuilder.popStackToClose(endTag);
        assertTrue(xmlTreeBuilder.getStack().isEmpty());
    }

}