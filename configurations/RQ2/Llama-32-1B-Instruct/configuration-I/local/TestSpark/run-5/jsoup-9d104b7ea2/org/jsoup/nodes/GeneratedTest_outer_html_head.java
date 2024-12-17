package org.jsoup.nodes;

public class GeneratedTest_outer_html_head {

    @Test
    public void test_outer_html_head() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        outerHtmlHead(doc, 0, Accumulator.EMPTY);
        assertEquals("<", accum.toString());
    }

}