package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Element.OffsetSettings element = Mockito.mock(Element.OffsetSettings.class);

        comment.outerHtmlTail(outputSettings, element, 1);
        assertEquals("", outputSettings.toString());
    }

}