package org.jsoup.nodes;

public class GeneratedOutputSettings_DocumentReturnsOutputSettings {

    @Test
    public void outputSettings_DocumentReturnsOutputSettings() {
        OutputSettings settings = mock(OutputSettings.class);
        when(parser().outputSettings()).thenReturn(settings);
        Document document = new Document("https://example.com");
        assertEquals(settings, document.outputSettings());
    }

}