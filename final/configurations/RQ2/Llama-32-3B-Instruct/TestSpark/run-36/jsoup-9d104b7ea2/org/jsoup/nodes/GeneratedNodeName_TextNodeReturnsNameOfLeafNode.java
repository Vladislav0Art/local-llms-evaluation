package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeName_TextNodeReturnsNameOfLeafNode {

    @Mock
    private LeafNode mockLeafNode;

    @Test
    public void nodeName_TextNodeReturnsNameOfLeafNode() {
        when(mockLeafNode.nodeName()).thenReturn("leaf-node");
        assertEquals("leaf-node", ((TextNode) mockLeafNode).nodeName());
    }

}