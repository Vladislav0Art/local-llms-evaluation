package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
LeafNode clone][withoutChildren]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [LeafNode clone][withoutChildren]Test() {
        TextNode leafNode = new TextNode("");
        document.appendChild(leafNode);
        TextNode clonedNode = leafNode.clone();
        assertNotNull(clonedNode.getWholeText());
    }
}

}