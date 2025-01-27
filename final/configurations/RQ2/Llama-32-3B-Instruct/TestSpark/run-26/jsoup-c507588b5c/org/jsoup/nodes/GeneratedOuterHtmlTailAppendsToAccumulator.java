package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailAppendsToAccumulator {

    @Test
    public void outerHtmlTailAppendsToAccumulator() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        Document.OutputSettings settings = null;
        TextNode node = new TextNode("Hello");
        node.outerHtmlTail(accum, 0, settings);
        String result = out.toString();
        assertTrue(result.contains("</p><br>"));
    }

}