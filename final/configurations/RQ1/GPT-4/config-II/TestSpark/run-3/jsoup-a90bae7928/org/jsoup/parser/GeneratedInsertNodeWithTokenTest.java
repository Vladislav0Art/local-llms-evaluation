package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInsertNodeWithTokenTest {

    @Test
    public void insertNodeWithTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insertNode(new Comment("Comment"), new Token.Comment());
        assertEquals("<root></root>", xmlTreeBuilder.getSettings().toString());
    }

}