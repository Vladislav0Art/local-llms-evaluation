package org.jsoup.nodes;

public class GeneratedExpectForm_test3 {

    private Document document;

    @Before
    public void setup() {
        Document.createShell("http://example.com");
        document = new Document("http://example.com");
    }

    @Test
    public void expectForm_test3() {
        String cssQuery = "#example input";
        DocumentExpectation expectation = new DocumentExpectation(document);
        Document expectForm = expectation.expectForm(cssQuery);
        assertEquals(expectForm, document.expectForm(cssQuery));
    }

}