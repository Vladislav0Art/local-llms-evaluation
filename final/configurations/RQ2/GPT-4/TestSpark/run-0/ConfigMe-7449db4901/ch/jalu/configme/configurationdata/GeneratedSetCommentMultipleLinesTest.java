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

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path4", "comment line 1", "comment line 2");

        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path4").get(0), is("comment line 1"));
        assertThat(commentsConfiguration.getAllComments().get("path4").get(1), is("comment line 2"));
    }

}