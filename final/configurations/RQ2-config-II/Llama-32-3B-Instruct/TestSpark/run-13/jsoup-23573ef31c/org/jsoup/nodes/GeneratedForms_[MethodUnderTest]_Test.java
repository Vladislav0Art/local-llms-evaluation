package org.jsoup.nodes;

public class GeneratedForms_[MethodUnderTest]

_Test {

    @Test
    public void forms_[ MethodUnderTest]_Test() {
        Document document = Document.createShell("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.size() > 0);
    }

}