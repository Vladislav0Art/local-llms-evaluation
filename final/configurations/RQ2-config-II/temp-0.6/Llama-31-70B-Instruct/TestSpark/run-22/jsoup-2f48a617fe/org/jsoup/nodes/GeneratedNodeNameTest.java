package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        String expectedNodeName = "comment";
        String actualNodeName = comment.nodeName();
        assertEquals(expectedNodeName, actualNodeName);
    }

}