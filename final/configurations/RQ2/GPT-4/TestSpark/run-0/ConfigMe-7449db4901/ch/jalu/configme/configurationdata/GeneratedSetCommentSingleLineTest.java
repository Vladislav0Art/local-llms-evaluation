package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "single comment");

        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path3").get(0), is("single comment"));
    }

}