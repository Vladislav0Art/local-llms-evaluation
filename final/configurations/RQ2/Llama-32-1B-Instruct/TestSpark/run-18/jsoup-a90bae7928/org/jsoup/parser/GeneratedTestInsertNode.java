package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        Node node = createNode("node", null);
        Mockito.when(node.getParent().getChildren()).thenReturn(node);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, node, null);
        xmlTreeBuilder.insert(node);
    }

}