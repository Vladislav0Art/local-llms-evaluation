package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_MocksCloneToReturnClonedTextNode {

    @Test
    public void clone_MocksCloneToReturnClonedTextNode() {
        //given
        TextNode clone = new TextNode("Hello World");

        //when
        TextNode result = textNode.clone();

        //then
        assertNotNull(result);
        assertEquals(clone, result);
    }

}