package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateShellCustomBaseUri {

    @Test
    public void createShellCustomBaseUri() {
        Document document = Document.createShell("https://www.example.com");
        assert document != null;
    }

}