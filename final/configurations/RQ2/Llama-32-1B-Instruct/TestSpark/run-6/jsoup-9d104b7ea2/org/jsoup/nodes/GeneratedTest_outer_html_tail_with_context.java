package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_outer_html_tail_with_context {

    @Test
    public void test_outer_html_tail_with_context() throws IOException {
        Document doc = new Document();
        Appendable accum = doc.getOuterHtml();
        int depth = 1;
        assertEquals("<p>World!</p>", StringUtil.toString(accum, depth));
    }

}