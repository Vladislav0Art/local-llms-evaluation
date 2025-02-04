package org.jsoup.nodes;

public class GeneratedTextShouldReturnEmptyStringWhenBlank {

    @Test
    public void textShouldReturnEmptyStringWhenBlank() {
        TextNode node = new TextNode("");
        String result = node.text();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}