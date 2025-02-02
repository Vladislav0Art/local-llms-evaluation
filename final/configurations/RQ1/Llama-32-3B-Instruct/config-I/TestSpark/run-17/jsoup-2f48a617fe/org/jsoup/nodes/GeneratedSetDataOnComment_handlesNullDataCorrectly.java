package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers.*;

@RunWith(JUnit4.class)
public class GeneratedSetDataOnComment_handlesNullDataCorrectly {

    @Test
    public void setDataOnComment_handlesNullDataCorrectly() {
        Comment comment = new Comment("Hello, World!");
        comment.setData(null);
        assertThat(comment.getData(), is(""));
    }

}