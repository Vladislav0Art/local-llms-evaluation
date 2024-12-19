package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GeneratedInner_html_head {

    @Test
    public void inner_html_head() throws IOException {
        Document document = new Document();
        Appendable accum = document.createOuterHtmlHead(null, 0, Document.OutputSettings.PrettyPrint(), false, true, true, true);

        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, 0, null);
        String result = StringUtil.normaliseWhitespace(node.text());
        assertEquals("<>text", result);
    }

}