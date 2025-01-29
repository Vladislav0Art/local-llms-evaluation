package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;

public class GeneratedAsXmlDeclaration_setsAsXmlDeclaration {

    private Document document;

    @Before
    public void setup() throws Exception {
        Parser parser = new Parser();
        ParseSettings parseSettings = parser.getSettings();
        parseSettings.setFormMode(Parser.FORM_MODE_COMMENT);
        document = new Document("comment.html", parseSettings, parser);
    }

    @Test
    public void asXmlDeclaration_setsAsXmlDeclaration() throws Exception {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertEquals("<comment>", xmlDeclaration.getValue());
    }

}