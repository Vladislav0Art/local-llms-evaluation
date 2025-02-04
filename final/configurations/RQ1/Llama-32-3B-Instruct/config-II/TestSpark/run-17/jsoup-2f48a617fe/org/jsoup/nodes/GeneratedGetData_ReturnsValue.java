package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetData_ReturnsValue {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void getData_ReturnsValue() {
        Comment comment = new Comment("<!-- comment -->");
        assertEquals("<!-- comment -->", comment.getData());
    }

}