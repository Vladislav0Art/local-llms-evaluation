package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInsertToken_startTag {

    @Test
    public void testInsertToken_startTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(new Token.StartTag("<root>"));
        assertEquals("<root>", element.getTagName());
    }

}