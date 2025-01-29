package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedTest_outerHtmlHead {

    private Document document, comment1;
    private Comment comment2;

    @Before
    public void setup() throws Exception {
        Parser parser = new Parser();
        ParseSettings parseSettings = parser.getSettings();
        parseSettings.setFormMode(Parser.FORM_MODE_COMMENT);
        document = new Document(), comment1 = new Comment(), comment2 = new Comment();
        comment2.outerHtmlElement().setText("");
    }

    @Test
    public void test_outerHtmlHead() throws Exception {
        addElementToDocument(document, comment1, "comment1");
        Assert.assertEquals("<comment1>test</comment1>", document.selectFirst("comment1").outerHtmlElement().toString());
    }

}