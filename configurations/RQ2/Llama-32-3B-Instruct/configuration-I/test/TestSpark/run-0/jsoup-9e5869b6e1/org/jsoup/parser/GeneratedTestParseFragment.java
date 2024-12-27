package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParseFragment {

    @Mock
    private TreeBuilder treeBuilder;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Reader reader;

    @Test
    public void testParseFragment() {
        List<Node> nodes = new ArrayList<>();
        Node node = new Node();
        nodes.add(node);
        when(treeBuilder.parseFragment(Mockito.anyString(), Mockito.any(Element.class), Mockito.anyString(), Mockito.any(Parser.class))).thenReturn(nodes);
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder(treeBuilder, parseSettings);
        List<Node> result = htmlTreeBuilder.parseFragment("inputFragment", null, "baseUri", null);
        assertEquals(nodes, result);
    }

}