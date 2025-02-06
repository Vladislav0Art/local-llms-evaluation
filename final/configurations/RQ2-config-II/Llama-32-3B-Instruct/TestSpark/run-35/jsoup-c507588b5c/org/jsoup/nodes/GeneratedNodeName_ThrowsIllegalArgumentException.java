package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeName_ThrowsIllegalArgumentException {

    @Test
    public void nodeName_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new TextNode(null));
    }

}