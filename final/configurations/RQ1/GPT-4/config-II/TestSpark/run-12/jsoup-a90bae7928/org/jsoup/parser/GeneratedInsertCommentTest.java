package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertCommentTest {

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.Comment("?xml version=\"1.0\" encoding=\"UTF-8\" ?"));
        assertEquals("<?xml version=\"1.0\" encoding=\"utf-8\" ?>", xmlTreeBuilder.doc.childNode(0).outerHtml());
    }

}