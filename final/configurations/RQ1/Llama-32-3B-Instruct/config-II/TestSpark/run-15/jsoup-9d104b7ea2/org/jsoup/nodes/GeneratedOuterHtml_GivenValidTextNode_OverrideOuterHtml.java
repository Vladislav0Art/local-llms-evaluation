package org.jsoup.nodes;

public class GeneratedOuterHtml_GivenValidTextNode_OverrideOuterHtml {

    @Test
    public void outerHtml_GivenValidTextNode_OverrideOuterHtml() throws IOException, InterruptedException {
        // given
        String text = "Hello World";

        // when
        ApplicableTextWriter writer = new DefaultApplicableTextWriter();
        Document document = Document.create();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(writer, 0, Document.OutputSettings.builder().prettyPrint(true).build());
        String result = writer.toString();

        // then
        assertContains(result, "Hello World");
    }

}