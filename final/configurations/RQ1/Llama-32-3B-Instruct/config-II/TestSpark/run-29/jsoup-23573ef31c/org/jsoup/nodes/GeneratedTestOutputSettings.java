package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

    @Test
    public void testOutputSettings() {
        Document document = new Document();
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

}