package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedOutputSettings_returnsNonNullOutputSettings {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void outputSettings_returnsNonNullOutputSettings() {
        Document document = new Document();
        OutputSettings outputSettings = document.outputSettings();
        assertNotNull(outputSettings);
    }

}