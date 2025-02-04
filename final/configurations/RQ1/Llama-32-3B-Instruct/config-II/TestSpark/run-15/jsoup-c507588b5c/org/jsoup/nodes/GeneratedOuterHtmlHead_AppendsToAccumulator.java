package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_AppendsToAccumulator {

    @Test
    public void outerHtmlHead_AppendsToAccumulator() throws IOException {
        // given
        Appendable accumulator = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        // when
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accumulator, 0, outputSettings);

        // then
        assertEquals("<p>Hello World</p>", accumulator.toString());
    }

}