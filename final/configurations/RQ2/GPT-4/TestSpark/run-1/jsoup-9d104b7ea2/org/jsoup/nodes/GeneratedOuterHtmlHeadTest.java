package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("test", sb.toString());
    }

}