package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringWriter();
        int depth = 0;
        Document.OutputSettings out = null;
        node.outerHtmlTail(accum, depth, out);
        assertEquals("Hello, World!", accum.toString());
        assertNotNull(out);
    }

}