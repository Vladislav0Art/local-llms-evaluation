package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_outer_html_head_with_context {

    @Test
    public void test_outer_html_head_with_context() throws IOException {
        Document doc = new Document();
        Appendable accum = doc.getOuterHtml();
        int depth = 0;
        assertEquals("<p>Hello, World!</p>", StringUtil.toString(accum, depth));
    }

}