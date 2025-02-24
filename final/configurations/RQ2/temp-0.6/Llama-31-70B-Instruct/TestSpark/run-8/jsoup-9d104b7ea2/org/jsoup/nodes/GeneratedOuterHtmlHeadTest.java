package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringWriter stringWriter = new StringWriter();
        textNode.outerHtmlHead(stringWriter, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("test", stringWriter.toString());
    }

}