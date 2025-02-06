package org.jsoup.nodes;

public class GeneratedExpectForm_[MethodUnderTest](Scenario)

_Test {

    @Test
    public void expectForm_[ MethodUnderTest](Scenario) _Test() {
        FormElement form = new FormElement();
        Document document = Document.createShell("https://www.example.com").expectForm(".form");
        assertEquals(form, document.expectForm(".form"));
    }

}