package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedClone_Method_ReturnsCloneOfTextNode {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void clone_Method_ReturnsCloneOfTextNode() {
        TextNode textNode = new TextNode("Hello");
        TextNode clonedTextNode = textNode.clone();
        org.junit.Assert.assertNotNull(clonedTextNode);
        org.junit.Assert.assertEquals(textNode.text(), clonedTextNode.text());
    }

}