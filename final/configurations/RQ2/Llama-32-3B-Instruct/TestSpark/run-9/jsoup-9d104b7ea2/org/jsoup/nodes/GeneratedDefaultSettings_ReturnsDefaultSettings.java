package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedDefaultSettings_ReturnsDefaultSettings {

    @Test
    public void defaultSettings_ReturnsDefaultSettings() {
        Document.OutputSettings settings = mock(Document.OutputSettings.class);
        assertEquals(defaultSettings(), settings.defaultSettings());
    }

}