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

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> testComments = new HashMap<>();
        testComments.put("path6", Arrays.asList("comment1", "comment2"));
        testComments.put("path7", Arrays.asList("comment3", "comment4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(testComments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertThat(allComments.size(), is(2));
        assertThat(allComments.get("path6").get(0), is("comment1"));
        assertThat(allComments.get("path6").get(1), is("comment2"));
        assertThat(allComments.get("path7").get(0), is("comment3"));
        assertThat(allComments.get("path7").get(1), is("comment4"));
    }

}