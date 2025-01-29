package org.jsoup.nodes;

public class GeneratedCreate_from_encoded_test {

    @Test
    public void create_from_encoded_test() throws IOException {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertTrue(node != null && node.text().equals("Hello World"));
    }

}