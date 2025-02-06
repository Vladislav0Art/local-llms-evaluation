package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputSettings_SettingOutputSettings_setsDocumentOutputSettings {

    @Test
    public void outputSettings_SettingOutputSettings_setsDocumentOutputSettings() {
        // Arrange
        Document document = new Document(null);
        OutputSettings outputSettings = Mockito.mock(OutputSettings.class);
        when(document.outputSettings(outputSettings)).thenReturn(document);

        // Act
        document.outputSettings(outputSettings);

        // Assert
        assertEquals(outputSettings, document.outputSettings());
    }

}