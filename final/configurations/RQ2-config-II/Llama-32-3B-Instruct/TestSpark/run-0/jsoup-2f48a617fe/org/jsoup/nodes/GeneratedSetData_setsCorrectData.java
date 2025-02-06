package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class GeneratedSetData_setsCorrectData {

    @Test
    public void setData_setsCorrectData() {
        String data = "new data";
        Comment comment = new Comment("old data");
        comment.setData(data);
        assertThat(comment.getData(), is(data));
    }

}