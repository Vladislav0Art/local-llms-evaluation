package org.jsoup.nodes;

public class GeneratedTest {

`
        9.
        10.    `

    @Test
    public void testNodeName() {
		`
        12. TextNode textNode = new TextNode("Some Text");`
        13. assertEquals("Some Text", textNode.nodeName());`
        14.
    }

    @Test
    public void testText() {
		`
        18. TextNode textNode = new TextNode("Some Text");`
        19. assertEquals("Some Text", textNode.text());`
        20.
    }

    @Test
    public void testIsBlank() {
		`
        24. TextNode textNode = new TextNode("");`
        25. assertTrue(textNode.isBlank());`
        26.
    }

    @Test
    public void testSplitText() {
		`
        30. TextNode textNode = new TextNode("Some Text");`
        31. TextNode splitTextNode = textNode.splitText(5);`
        32. assertEquals("Text", splitTextNode.text());`
        33.
    }

    @Test
    public void testToString() {
		`
        37. TextNode textNode = new TextNode("Some Text");`
        38. assertEquals("Some Text", textNode.toString());`
        39.
    }

}