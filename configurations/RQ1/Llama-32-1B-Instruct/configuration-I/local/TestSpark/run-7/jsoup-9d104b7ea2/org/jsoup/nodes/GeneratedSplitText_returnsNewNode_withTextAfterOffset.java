package org.jsoup.nodes;

public class GeneratedSplitText_returnsNewNode_withTextAfterOffset {

    @Test
    public void splitText_returnsNewNode_withTextAfterOffset() {
        String text = "Hello World!";
        TextNode node = createTextNode(splitText(-1));
        assertEquals("World!", node.text());
    }

    private void assertTextIsBlank(Document document) {
        for (TextNode child : document.childNodes()) {
            if (!child.text().isEmpty()) return;
        }
        assertTrue(document.isDocumentEmpty());
    }

    private String stripLeadingWhitespace(StringBuilder sb) {
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private boolean lastCharIsWhitespace(StringBuilder sb) {
        if (sb != null && !sb.isEmpty()) {
            if (sb.charAt(sb.length() - 1) == ' ') return true;
        }
        return false;
    }

}