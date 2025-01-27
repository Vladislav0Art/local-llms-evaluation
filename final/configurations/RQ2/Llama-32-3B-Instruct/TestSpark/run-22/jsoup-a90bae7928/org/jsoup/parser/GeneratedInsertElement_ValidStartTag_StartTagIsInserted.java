package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertElement_ValidStartTag_StartTagIsInserted {

    @Mock
    private TreeBuilder treeBuilder;

    public void setup() {
        when(treeBuilder.newInstance()).thenReturn(this);
        // Add other setup necessary for tests
    }

    @Test
    public void insertElement_ValidStartTag_StartTagIsInserted() {
        Token.StartTag startTag = new Token.StartTag();
        when(treeBuilder.insert(startTag)).thenReturn(startTag);
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) treeBuilder.newInstance();
        Element result = xmlTreeBuilder.insert(startTag);
        assertTrue(result != null);
    }

}