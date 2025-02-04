package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_AppendsToAccumulator {

    @Test
    public void outerHtmlTail_AppendsToAccumulator() throws IOException {
        // given
        Appendable accumulator = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        // when
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accumulator, 0, outputSettings);

        // then
        assertEquals("", accumulator.toString());
    }

}