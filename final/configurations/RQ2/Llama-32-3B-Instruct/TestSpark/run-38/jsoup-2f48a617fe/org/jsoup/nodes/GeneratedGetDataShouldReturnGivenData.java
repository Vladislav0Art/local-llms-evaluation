package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetDataShouldReturnGivenData {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void getDataShouldReturnGivenData() {
        String expectedData = "data";
        Comment comment = new Comment(expectedData);
        String actualData = comment.getData();
        Mockito.when(comment.data).thenReturn(expectedData);
        assertEquals(expectedData, actualData);
    }

}