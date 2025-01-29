package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithCommentToken {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithCommentToken() {
        xmlTreeBuilder.insert(new Comment("<!DOCTYPE html><body></body>"));
        xmlTreeBuilder.insert(new Comment("<!-- comment -->"));
        String input = "<html><head></head><body></body></html>";
        Document document = xmlTreeBuilder.parse(input);
        assertTrue(document.body().text().contains("<!-- comment -->"));
    }

}