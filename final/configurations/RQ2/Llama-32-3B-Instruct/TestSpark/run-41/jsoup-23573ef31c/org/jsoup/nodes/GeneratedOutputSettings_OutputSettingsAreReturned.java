package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedOutputSettings_OutputSettingsAreReturned {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private OutputSettings outputSettings;

    @Test
    public void outputSettings_OutputSettingsAreReturned() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("http://example.com");
        OutputSettings result = document.outputSettings();
        assertNotNull(result);
        assertEquals(outputSettings, result);
    }

}