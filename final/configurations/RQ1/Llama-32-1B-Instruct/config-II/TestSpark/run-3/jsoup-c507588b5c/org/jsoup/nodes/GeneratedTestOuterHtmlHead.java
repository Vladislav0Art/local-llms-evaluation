package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringWriter();
        int depth = 0;
        Document.OutputSettings out = null;
        node.outerHtmlHead(accum, depth, out);
        assertEquals("Hello, World!", accum.toString());
        assertNotNull(out);
    }

}