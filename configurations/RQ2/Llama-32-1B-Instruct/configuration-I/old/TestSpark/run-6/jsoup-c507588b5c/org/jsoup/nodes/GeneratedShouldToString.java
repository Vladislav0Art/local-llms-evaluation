package org.jsoup.nodes;

public class GeneratedShouldToString {

    @Test
    public void shouldToString() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("<TextNode><Text> Hello &nbsp;World&quot;</Text></TextNode>", textNode.toString());
    }

}