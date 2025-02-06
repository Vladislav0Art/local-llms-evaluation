package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewNodeSetDataTest {

    @Test
    public void newNodeSetDataTest() {
        Comment comment = new Comment("");
        String data = "new data";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}