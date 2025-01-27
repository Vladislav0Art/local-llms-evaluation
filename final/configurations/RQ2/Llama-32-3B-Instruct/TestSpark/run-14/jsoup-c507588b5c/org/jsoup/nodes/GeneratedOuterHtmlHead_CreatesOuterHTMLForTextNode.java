package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlHead_CreatesOuterHTMLForTextNode {

    @Test
    public void outerHtmlHead_CreatesOuterHTMLForTextNode() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("<test>");
        node.outerHtmlHead(accum, 1, out);
        accum.toString().shouldContain(">\n");
    }

}