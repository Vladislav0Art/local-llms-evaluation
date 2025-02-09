package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetDataShouldSetNewDataForComment {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void setDataShouldSetNewDataForComment() {
        Comment comment = new Comment(data);
        comment.setData("newData");
        Mockito.verify(comment.data).equals("newData");
    }

}