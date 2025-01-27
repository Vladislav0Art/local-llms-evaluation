package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetData_returnsData {

    @Test
    public void getData_returnsData() {
        Comment comment = new Comment("data");
        AssertEquals("data", comment.getData());
    }

}