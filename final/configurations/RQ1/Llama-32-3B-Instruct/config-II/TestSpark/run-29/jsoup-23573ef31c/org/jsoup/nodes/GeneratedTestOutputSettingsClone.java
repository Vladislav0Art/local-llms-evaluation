package org.jsoup.nodes;

public class GeneratedTestOutputSettingsClone {

    @Test
    public void testOutputSettingsClone() {
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.prettyPrint(true);
        outputSettings.indentAmount(4);
        Document document = new Document();
        document.outputSettings(outputSettings.clone());
        Assert.assertTrue(document.outputSettings().prettyPrint());
        Assert.assertEquals(4, document.outputSettings().indentAmount());
    }

}