package org.jsoup.nodes;

public class GeneratedTest_outer_html_head_with_empty_context {

    @Test
    public void test_outer_html_head_with_empty_context() throws IOException {
        Document doc = new Document();
        Appendable accum = doc.getOuterHtml();
        int depth = 0;
        assertEquals("", StringUtil.toString(accum, depth));
    }

}