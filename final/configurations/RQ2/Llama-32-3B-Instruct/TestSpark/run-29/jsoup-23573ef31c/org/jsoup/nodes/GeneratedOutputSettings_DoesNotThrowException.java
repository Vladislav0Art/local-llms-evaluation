package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOutputSettings_DoesNotThrowException {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @InjectMocks
    private Document document;

    @Test
    public void outputSettings_DoesNotThrowException() {
        OutputSettings expectedSettings = OutputSettings.CleanerHtmlMode;
        Document testDocument = new Document("https://example.com");
        testDocument.outputSettings(expectedSettings);
        assertEquals(expectedSettings, testDocument.outputSettings());
    }

}