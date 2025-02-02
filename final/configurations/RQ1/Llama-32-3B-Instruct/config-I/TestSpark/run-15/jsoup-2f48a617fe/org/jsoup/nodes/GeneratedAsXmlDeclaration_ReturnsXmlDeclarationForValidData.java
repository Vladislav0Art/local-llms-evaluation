package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_ReturnsXmlDeclarationForValidData {

    @Test
    public void asXmlDeclaration_ReturnsXmlDeclarationForValidData() throws Exception {
        Document document = null;
        Parser parser = new Parser(true);
        String htmlString = "<!DOCTYPE PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html><body><!--This is a comment--></body></html>";
        document = Document.parse(htmlString, parser);
        Comment comment = new Comment("!");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}