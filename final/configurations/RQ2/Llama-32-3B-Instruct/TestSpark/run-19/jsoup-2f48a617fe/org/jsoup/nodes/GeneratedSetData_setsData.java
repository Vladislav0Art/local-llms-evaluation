package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetData_setsData {

    @Test
    public void setData_setsData() {
        Comment comment = new Comment("");
        String data = "newData";
        comment.setData(data);
        AssertEquals(data, comment.getData());
    }

}