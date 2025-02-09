package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedAsXmlDeclaration_comment_returnsSelfAsDeclaration {

    @Test
    public void asXmlDeclaration_comment_returnsSelfAsDeclaration() throws Exception {
        Document document = Document.parse("<xml declaration='test'/></xml>");
        XmlDeclaration declaration = (XmlDeclaration) document.selectFirst("xml declaration");
        assertEquals(declaration.getData(), declaration.asXmlDeclaration());
    }

}