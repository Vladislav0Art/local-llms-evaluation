package org.jsoup.nodes;

public class GeneratedOuterHtml_Tail_OverrideOuterHtml {

    @Test
    public void outerHtml_Tail_OverrideOuterHtml() throws IOException, InterruptedException {
        // given

        // when
        ApplicableTextWriter writer = new DefaultApplicableTextWriter();
        Document document = Document.create();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(writer, 0, Document.OutputSettings.builder().prettyPrint(true).build());
        String result = writer.toString();

        // then
        assertNotEquals("", result);
    }

}