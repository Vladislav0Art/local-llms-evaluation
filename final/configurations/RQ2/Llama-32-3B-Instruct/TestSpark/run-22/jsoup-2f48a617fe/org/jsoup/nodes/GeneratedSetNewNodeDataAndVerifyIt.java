package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public class GeneratedSetNewNodeDataAndVerifyIt {

    @Test
    public void setNewNodeDataAndVerifyIt() {
        Comment comment = new Comment("");
        comment.setData("new test");
        assertThat(comment.getData(), is("new test"));
    }

}