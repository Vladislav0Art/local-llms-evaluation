package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThat(commentsConfiguration.getAllComments().isEmpty(), is(true));

        // Add some comments and check again
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        commentsConfiguration.setComment("path2", "comment3", "comment4");
        assertThat(commentsConfiguration.getAllComments().size(), is(2));
        assertThat(commentsConfiguration.getAllComments().get("path1"), is(Arrays.asList("comment1", "comment2")));
        assertThat(commentsConfiguration.getAllComments().get("path2"), is(Arrays.asList("comment3", "comment4")));
    }

}