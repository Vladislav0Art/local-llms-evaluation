package org.jsoup.nodes;

public class GeneratedQuirksMode_[MethodUnderTest]

_Test {

    @Test
    public void quirksMode_[ MethodUnderTest]_Test() {
        QuirksMode quirksMode = QuirksMode.AUTOSTRICT;
        Document document = Document.createShell("https://www.example.com").quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

}