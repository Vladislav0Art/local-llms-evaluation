package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class Generated[Document][Scenario]

Test2 {

    @Test
    public void [Document][Scenario]Test2() {
        // Create a Document instance with default charset
        Document document = createShell("http://example.com");

        // Update the meta charset element of the Document
        document.updateMetaCharsetElement(true);
        assert document.charset().equals(Charset.forName("utf-8"));

        // Verify that the update method returns true for both methods
    }

}