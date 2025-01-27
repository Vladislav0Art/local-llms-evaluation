package org.jsoup.nodes;

public class GeneratedExpectForm_test {

    @Test
    public void expectForm_test() {
        Document document = new Document("http://example.com");
        FormElement form = document.expectForm("#myForm");
        assertNotNull(form);
    }

}