package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetDataTest {

    @Mock
    private Comment comment;

    @Test
    public void setDataTest() {
        comment.setData("Test data");
        assertEquals("Test data", comment.getData());
    }

}