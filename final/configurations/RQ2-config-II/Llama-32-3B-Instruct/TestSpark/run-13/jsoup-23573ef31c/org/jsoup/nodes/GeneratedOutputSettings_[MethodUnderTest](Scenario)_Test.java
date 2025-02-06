package org.jsoup.nodes;

public class GeneratedOutputSettings_[MethodUnderTest](Scenario)

_Test {

    @Test
    public void outputSettings_[ MethodUnderTest](Scenario) _Test() {
        Document document = Document.createShell("https://www.example.com");
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        assertNotNull(document.outputSettings());
    }

}