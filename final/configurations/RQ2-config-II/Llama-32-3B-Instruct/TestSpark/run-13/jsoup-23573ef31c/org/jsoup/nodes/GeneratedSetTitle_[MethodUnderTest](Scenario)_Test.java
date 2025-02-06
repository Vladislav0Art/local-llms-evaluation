package org.jsoup.nodes;

public class GeneratedSetTitle_[MethodUnderTest](Scenario)

_Test {

    @Test
    public void setTitle_[ MethodUnderTest](Scenario) _Test() {
        Document document = Document.createShell("https://www.example.com");
        document.setTitle("Example Title");
        assertEquals("Example Title", document.title());
    }

}