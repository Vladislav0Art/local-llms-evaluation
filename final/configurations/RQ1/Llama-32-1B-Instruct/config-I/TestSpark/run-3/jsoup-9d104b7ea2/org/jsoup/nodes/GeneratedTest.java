package org.jsoup.nodes;

public class GeneratedTest {

    private static String inputText = "";

    @Test
    public void [MethodUnderTest]

    IsBlank() {
        assertEquals(false, isBlank());
    }

    @Test
    public void splitText() {
        inputText = "<a>   <b>text</b> </a>";
        TextNode node = new TextNode(splitText(0));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffset() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(3));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrim() {
        inputText = "<a>   <b>text  </b><c>another text  </c>";
        TextNode node = new TextNode(splitText(6));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimAndLeading() {
        inputText = "<a>   <b>text  </b><c>another text  </c>";
        TextNode node = new TextNode(splitText(2));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimAndTrailing() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(6));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimAndTrailingAndLeading() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(2));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimLeading() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(3));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimTrailing() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(6));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimLeadingTrailing() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(6));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void splitTextWithOffsetAndTrimLeadingTrailingAndLeading() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(3));
        assertEquals("<a><b>text</b></a>", node.text());
    }

    @Test
    public void [MethodUnderTest]

    LastCharIsWhitespace() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            if (!lastCharIsWhitespace(sb)) {
                break;
            }
        }
        assertEquals("text", sb.toString());
    }

}