package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlTail_AppendsWholeTextToAccum {

    @Test
    public void outerHtmlTail_AppendsWholeTextToAccum() throws IOException {
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        Document.OutputSettings out = Document.OutputSettings.defaultAttribute();
        TextNode node = new TextNode("<test>");
        node.outerHtmlTail(accum, 0, out);
        assertTrue(accum.toString().contains("</test>"));
    }

}