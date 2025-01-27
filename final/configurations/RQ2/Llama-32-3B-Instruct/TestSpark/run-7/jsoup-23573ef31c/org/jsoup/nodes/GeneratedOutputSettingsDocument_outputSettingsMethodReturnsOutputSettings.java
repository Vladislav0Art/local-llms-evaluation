package org.jsoup.nodes;

public class GeneratedOutputSettingsDocument_outputSettingsMethodReturnsOutputSettings {

    @Test
    public void outputSettingsDocument_outputSettingsMethodReturnsOutputSettings() {
        OutputSettings expectedOutputSettings = mock(OutputSettings.class);
        when(expectedOutputSettings.toString()).thenReturn("output settings");
        Document document = new Document("");
        assertEquals(expectedOutputSettings, document.outputSettings());
    }

}