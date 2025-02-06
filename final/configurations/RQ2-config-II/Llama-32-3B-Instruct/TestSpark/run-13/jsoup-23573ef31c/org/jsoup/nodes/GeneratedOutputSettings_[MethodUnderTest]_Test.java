package org.jsoup.nodes;

public class GeneratedOutputSettings_[MethodUnderTest]

_Test {

    @Test
    public void outputSettings_[ MethodUnderTest]_Test() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = Document.createShell("https://www.example.com").outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

}