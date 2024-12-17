package org.jsoup.nodes;

public class GeneratedTest_outer_html_tail {

    @Test
    public void test_outer_html_tail() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        outerHtmlTail(doc, 0, Accumulator.EMPTY);
        assertEquals("</", accum.toString());
    }

}