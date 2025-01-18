package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment cloned = comment.clone();
        assertEquals(cloned.getData(), comment.getData());
    }

}