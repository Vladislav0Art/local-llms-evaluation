package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetData_SetData {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void setData_SetData() {
        Comment comment = new Comment("<!-- comment -->");
        String newData = "new data";
        comment.setData(newData);
        assertEquals("new data", comment.getData());
    }

}