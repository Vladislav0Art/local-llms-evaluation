package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInsertNodeNoTokenTest {

    @Test
    public void insertNodeNoTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insertNode(new Comment("Comment"));
        assertEquals("<root></root>", xmlTreeBuilder.getSettings().toString());
    }

}