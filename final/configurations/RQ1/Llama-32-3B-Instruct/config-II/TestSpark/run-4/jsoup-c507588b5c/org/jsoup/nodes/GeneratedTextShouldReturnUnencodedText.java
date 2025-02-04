package org.jsoup.nodes;

public class GeneratedTextShouldReturnUnencodedText {

    @Test
    public void textShouldReturnUnencodedText() {
        TextNode node = new TextNode("hello");
        String result = node.text();
        assertNotNull(result);
        assertEquals("hello", result);
    }

}