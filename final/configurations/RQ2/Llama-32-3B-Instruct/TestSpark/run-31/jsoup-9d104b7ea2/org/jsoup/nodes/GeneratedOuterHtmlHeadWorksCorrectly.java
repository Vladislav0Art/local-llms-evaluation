package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedOuterHtmlHeadWorksCorrectly {

    @Test
    public void outerHtmlHeadWorksCorrectly() {
        String html = "<p>Hello World!</p>";
        Document document = new Document();
        TextNode textNode = new TextNode(document.html());
        Appendable accum = mockAppendable();
        int depth = 0;
        Document.OutputSettings out = mockDocumentOutputSettings();
        textNode.outerHtmlHead(accum, depth, out);
        assertThat(accum.toString(), is(html));
    }

}