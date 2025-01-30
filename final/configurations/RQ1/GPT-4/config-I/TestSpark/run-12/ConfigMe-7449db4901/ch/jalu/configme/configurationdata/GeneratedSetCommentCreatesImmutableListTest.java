package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedSetCommentCreatesImmutableListTest {

    @Test
    public void setCommentCreatesImmutableListTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "example.path";
        String commentLine = "Example comment";

        commentsConfiguration.setComment(path, commentLine);
        commentsConfiguration.getAllComments().get(path).add("Illegal comment");
    }

}