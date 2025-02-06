package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewNodeStringDataTest {

    @Test
    public void newNodeStringDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}