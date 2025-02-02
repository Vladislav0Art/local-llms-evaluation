package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }
}

class TestNodeTest {

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "&lt;Hello, World!&gt;";
        TextNode node = new TextNode(encodedText);
        org.junit.Assert.assertEquals("Hello, World!", node.text());
    }
}

class org.junit.TestNodeWithText extends org.jsoup.nodes.

Node {
    private String text;
		
		public org.junit.TestNodeWithText(String text) {
        this.text = text;
    }

    public String text () {
        return text;
    }
}

}