package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class Generated[Document][Scenario]

Test4 {

    @Test
    public void [Document][Scenario]Test4() {
        // Create a new Document instance with default charset
        Document document = createShell("http://example.com");

        // Get the output settings of the Document
        OutputSettings outputSettings = document.outputSettings();
        assert outputSettings.equals(mock(OutputSettings.class));

        // Update the meta charset element of the Document
        document.updateMetaCharsetElement(true);
        assert document.outputSettings().equals(mock(OutputSettings.class));
    }

}