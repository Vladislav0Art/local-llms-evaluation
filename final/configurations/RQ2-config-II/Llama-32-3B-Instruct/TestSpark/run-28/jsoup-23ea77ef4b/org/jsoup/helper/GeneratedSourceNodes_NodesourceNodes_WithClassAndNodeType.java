package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodes_NodesourceNodes_WithClassAndNodeType {

    @Mock
    private Document doc;

    @Test
    public void sourceNodes_NodesourceNodes_WithClassAndNodeType() {
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0) instanceof org.jsoup.nodes.Node);
    }

}