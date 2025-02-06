package org.jsoup.nodes;

public class GeneratedTestOutputSettingsNullOutputSettings {

    @Test
    public void testOutputSettingsNullOutputSettings() {
        OutputSettings outputSettings = null;
        Document document = new Document("");
        try {
            document.outputSettings(outputSettings);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}