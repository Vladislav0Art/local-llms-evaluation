package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert_NULL;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isValid;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeName_TextNode {

    @Test
    public void nodeName_TextNode() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text-node", node.nodeName());
    }

}