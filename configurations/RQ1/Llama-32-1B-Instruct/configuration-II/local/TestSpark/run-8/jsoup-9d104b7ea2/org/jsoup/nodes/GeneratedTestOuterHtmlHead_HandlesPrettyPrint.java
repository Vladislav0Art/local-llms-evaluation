package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead_HandlesPrettyPrint {

    @Test
    public void testOuterHtmlHead_HandlesPrettyPrint() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlHead(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.contains("\n\n"));
    }

}