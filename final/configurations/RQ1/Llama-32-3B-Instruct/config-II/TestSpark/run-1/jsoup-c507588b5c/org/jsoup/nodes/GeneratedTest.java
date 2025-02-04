package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void textNodeCreation_test() {
        final TextNode node = new TextNode("Hello World");
        Assert.assertEquals("Hello World", node.text());
        Assert.assertEquals("#text", node.nodeName());
    }

    @Test
    public void textNodeBlankness_test() {
        final TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
        final TextNode trimmedNode = new TextNode("   ");
        Assert.assertFalse(trimmedNode.isBlank());
    }

    @Test
    public void textNodeSet_text_test() {
        final TextNode node = new TextNode();
        node.text("Hello World");
        Assert.assertEquals("Hello World", node.text());
    }

    @Test
    public void wholeText

    test() {
        final TextNode node = new TextNode("Hello World");
        Assert.assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void textNodeSplitTest_splitAtOffset_test() throws IOException {
        final TextNode node = new TextNode("Hello World");
        final TextNode tailNode = node.splitText(6);
        Assert.assertEquals("Hello ", node.text());
        Assert.assertEquals("World", tailNode.text());
    }

    @Test
    public void outerHtmlHeadTest_outputSettings_test() throws IOException {
        final Document document = Document.createDocument();
        final TextNode node = new TextNode("   ");
        final Appendable accum = new StringBuilder();
        final Document.OutputSettings out = new Document.OutputSettings(true);
        node.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("<br>"));
    }

    @Test
    public void textNodeClone_test() {
        final TextNode node = new TextNode("Hello World");
        final TextNode clone = node.clone();
        Assert.assertEquals(node, clone);
    }

}