package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToStringShouldReturnExpectedString {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void toStringShouldReturnExpectedString() {
        Comment comment = new Comment(data);
        String expectedString = "expected string";
        Mockito.when(comment.data).thenReturn(expectedString);
        assertEquals(expectedString, comment.toString());
    }

}