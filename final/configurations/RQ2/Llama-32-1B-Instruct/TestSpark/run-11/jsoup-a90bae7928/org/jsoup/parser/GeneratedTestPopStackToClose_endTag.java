package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestPopStackToClose_endTag {

    @Test
    public void testPopStackToClose_endTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = builder.insert(new Token.StartTag("<root>"));
        builder.popStackToClose(builder.InsertToken.EndTag(startTag));
        assertEquals("http://example.com", startTag.getTagName());
    }

}