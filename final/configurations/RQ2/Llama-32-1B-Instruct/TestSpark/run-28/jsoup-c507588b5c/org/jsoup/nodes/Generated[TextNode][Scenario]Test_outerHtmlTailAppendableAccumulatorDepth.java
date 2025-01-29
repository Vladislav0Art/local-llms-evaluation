package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_outerHtmlTailAppendableAccumulatorDepth {

    @Test
    public void [TextNode][Scenario]Test_outerHtmlTailAppendableAccumulatorDepth() throws IOException {
        Appendable accum = System.out;
        Document doc = createDocument();
        outerHtmlTail(accum, 1, null);
        assertEquals("", accum.toString());
    }

}