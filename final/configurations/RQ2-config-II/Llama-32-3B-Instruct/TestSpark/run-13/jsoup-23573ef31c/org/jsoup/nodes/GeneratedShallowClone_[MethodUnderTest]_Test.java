package org.jsoup.nodes;

public class GeneratedShallowClone_[MethodUnderTest]

_Test {

    @Test
    public void shallowClone_[ MethodUnderTest]_Test() {
        Document document = Document.createShell("https://www.example.com");
        Document shallowClone = document.shallowClone();
        assertNotNull(shallowClone);
    }

}