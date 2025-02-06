package org.jsoup.nodes;

public class GeneratedCreateElement_[MethodUnderTest](Scenario)

_Test {

    @Test
    public void createElement_[ MethodUnderTest](Scenario) _Test() {
        Element element = new Tag();
        Document document = Document.createShell("https://www.example.com").createElement("div");
        assertEquals(element, document.createElement("div"));
    }

}