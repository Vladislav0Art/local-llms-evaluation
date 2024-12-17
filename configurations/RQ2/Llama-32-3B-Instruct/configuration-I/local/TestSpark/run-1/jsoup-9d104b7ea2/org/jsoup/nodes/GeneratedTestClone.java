package org.jsoup.nodes;

public class GeneratedTestClone {

    // ...

    /**
     * Returns the HTML head of the given node.
     *
     * @param ba  the output stream to write to
     * @param len the length of the input string
     * @param out the settings to use for the output
     */
    public void outerHtmlHead(OutputStream ba, int len, OutputSettings out) {
        // implementation...
    }

    /**
     * Returns the HTML tail of the given node.
     *
     * @param ba  the output stream to write to
     * @param len the length of the input string
     * @param out the settings to use for the output
     */
    public void outerHtmlTail(OutputStream ba, int len, OutputSettings out) {
        // implementation...
    }

    /**
     * Returns a deep copy of this node.
     *
     * @return a new instance of this class with its state copied from this one
     */
    public Node clone() {
        // implementation...
    }
}

public class TextNode extends Node {
    // ...

    /**
     * Returns the HTML head of the given text node.
     *
     * @param ba  the output stream to write to
     * @param len the length of the input string
     * @param out the settings to use for the output
     */
    public void outerHtmlHead(OutputStream ba, int len, OutputSettings out) {
        // implementation...
    }

    /**
     * Returns the HTML tail of the given text node.
     *
     * @param ba  the output stream to write to
     * @param len the length of the input string
     * @param out the settings to use for the output
     */
    public void outerHtmlTail(OutputStream ba, int len, OutputSettings out) {
        // implementation...
    }

    /**
     * Returns a deep copy of this text node.
     *
     * @return a new instance of this class with its state copied from this one
     */
    public TextNode clone() {
        // implementation...
    }
}

public class NodeTest {

    @Test
    public void testClone() throws Exception {
        Node node = new Node();
        TextNode textNode = (TextNode) node.clone();
        assertNotNull(textNode);
    }

}