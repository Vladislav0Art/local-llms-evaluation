package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_outerHtmlHeadAppendableAccumulatorDepth {

    @Test
    public void [TextNode][Scenario]Test_outerHtmlHeadAppendableAccumulatorDepth() throws IOException {
        Appendable accum = System.out;
        Document doc = createDocument();
        outerHtmlHead(accum, 0, null);
        assertEquals("Hello\n", accum.toString());
    }

}