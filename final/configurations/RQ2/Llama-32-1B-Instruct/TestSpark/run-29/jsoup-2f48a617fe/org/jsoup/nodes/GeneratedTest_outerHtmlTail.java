package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedTest_outerHtmlTail {

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
    public void test_outerHtmlTail() throws Exception {
        comment1.outerHtmlElement().setText("new text");
        assert (comment2 == null);
    }

    private void addElementToDocument(Document document, Element element) {
        if (!document.hasChildNodes()) {
            element.appendChild(document.createElement("br"));
        } else {
            for (int i = 0; i < element.childNodes.length; i++) {
                Element child = element.childNodes.item(i);
                if (child instanceof Document && ((Document) child).hasChildNodes() && !((Document) child).isEmpty()) {
                    addElementToDocument((Document) child, element);
                }
            }
        }
    }

    private static void assertNothing() {
        System.out.println("Test case passed");
    }

}