package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.*;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.StartTag("parent"));
        xmlTreeBuilder.insert(new Token.StartTag());
        xmlTreeBuilder.popStackToClose(new Token.EndTag());
        assertNotNull(xmlTreeBuilder.getDocument().childNodes());
    }

}