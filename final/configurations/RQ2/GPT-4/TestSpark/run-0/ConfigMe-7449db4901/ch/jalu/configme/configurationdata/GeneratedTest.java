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

public class GeneratedTest {

    @Test
    public void defaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThat(commentsConfiguration.getAllComments().isEmpty(), is(true));
    }

    @Test
    public void parameterizedConstructorTest() {
        Map<String, List<String>> testComments = new HashMap<>();
        testComments.put("path1", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(testComments);
        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path1").get(0), is("comment1"));
        assertThat(commentsConfiguration.getAllComments().get("path1").get(1), is("comment2"));
    }

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "single comment");

        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path3").get(0), is("single comment"));
    }

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path4", "comment line 1", "comment line 2");

        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path4").get(0), is("comment line 1"));
        assertThat(commentsConfiguration.getAllComments().get("path4").get(1), is("comment line 2"));
    }

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> testComments = new HashMap<>();
        testComments.put("path5", Arrays.asList("old comment1", "old comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(testComments);
        commentsConfiguration.setComment("path5", "new comment");

        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path5").size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path5").get(0), is("new comment"));
    }

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