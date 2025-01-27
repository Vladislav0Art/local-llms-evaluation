package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_isText() {
        TextNode node = new TextNode("text");
        Assert.assertEquals("text", node.nodeName());
    }

    @Test
    public void nodeName_emptyString() {
        TextNode node = new TextNode("");
        Assert.assertEquals("", node.nodeName());
    }

    @Test
    public void text_getsSetText() {
        TextNode node = new TextNode();
        node.text("new text");
        Assert.assertEquals("new text", node.text());
    }

    @Test
    public void text_emptyString() {
        TextNode node = new TextNode();
        Assert.assertEquals("", node.text());
    }

    @Test
    public void text_nullInput() {
        TextNode node = new TextNode();
        try {
            node.text(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void getWholeText_containsText() {
        TextNode node = new TextNode("text");
        Assert.assertEquals("text", node.getWholeText());
    }

    @Test
    public void getWholeText_emptyString() {
        TextNode node = new TextNode("");
        Assert.assertEquals("", node.getWholeText());
    }

    @Test
    public void isBlank_isFalse() {
        TextNode node = new TextNode("text");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void isBlank_emptyString() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

    @Test
    public void splitText_offsetGreaterOrEqualLength() {
        TextNode node = new TextNode("text");
        TextNode result = node.splitText(1);
        Assert.assertEquals("t", result.text());
    }

    @Test
    public void splitText_offsetLessThanLength() {
        TextNode node = new TextNode("text");
        TextNode result = node.splitText(3);
        Assert.assertEquals("", result.text());
    }

    @Test
    public void outerHtmlHead_isValidXml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("text");
        node.outerHtmlHead(accum, 0, out);
        String xml = accum.toString();
        Assert.assertTrue(xml.contains("<p>text</p>"));
    }

    @Test
    public void outerHtmlTail_isValidXml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("text");
        node.outerHtmlTail(accum, 0, out);
        String xml = accum.toString();
        Assert.assertTrue(xml.contains("</p>"));
    }

    @Test
    public void clone_isSameInstance() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        Assert.assertEquals(node, cloned);
    }

}