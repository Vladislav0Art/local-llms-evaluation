package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestAsXmlDeclaration {

    private Document doc;
    private Parser parser;

    public void setup() throws Parser.ParseError {
        parser = new Parser();
        doc = parser.parseInput("<!DOCTYPE html><body></body>", new StringReader(""));
    }

    @Test
    public void testAsXmlDeclaration() throws IOException {
        String xmlDeclarationContent = "<!DOCTYPE html><body></body>";
        Comment comment = new Comment(doc.body().child(0));
        comment.setData(xmlDeclarationContent);
        XmlDeclaration asXmlDeclaration = comment.asXmlDeclaration();
        assert not asXmlDeclaration == null;
    }

}