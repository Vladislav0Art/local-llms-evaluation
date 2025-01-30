package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Element el = new Element.Tag(Tag.valueOf("element", xmlTreeBuilder.defaultSettings()), "");
        xmlTreeBuilder.getStack().add(el);

        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "element";
        xmlTreeBuilder.popStackToClose(endTag);

        assertEquals(0, xmlTreeBuilder.getStack().size());
    }

}