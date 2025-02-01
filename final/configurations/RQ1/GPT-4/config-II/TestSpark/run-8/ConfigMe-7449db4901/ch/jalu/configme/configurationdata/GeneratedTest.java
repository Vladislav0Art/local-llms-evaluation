package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultConstructorCreationTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue("Default constructor should create an empty map",
                commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void customConstructorCreationTest() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("test-path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(customComments);
        assertEquals("Custom constructor should hold passed map",
                customComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentSingleCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my-path", "my-comment");
        assertEquals("Map should have single comment set",
                Collections.singletonList("my-comment"),
                commentsConfiguration.getAllComments().get("my-path"));
    }

    @Test
    public void setCommentMultipleCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my-path", "my-comment1", "my-comment2");
        assertEquals("Map should have 2 comments set",
                Arrays.asList("my-comment1", "my-comment2"),
                commentsConfiguration.getAllComments().get("my-path"));
    }

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my-path", "my-comment");
        commentsConfiguration.setComment("my-path", "my-new-comment");
        assertEquals("Setting comment should override previous value",
                Collections.singletonList("my-new-comment"),
                commentsConfiguration.getAllComments().get("my-path"));
    }

    @Test
    public void getAllCommentsImmutableViewTest() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("test-path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(customComments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        try {
            allComments.put("failure-test-path", Collections.singletonList("my-comment"));
            fail("Unmodifiable map should throw UnsupportedOperationException on put operation");
        } catch (UnsupportedOperationException e) {
            assertEquals("Custom constructor should return unmodifiable map",
                    customComments, allComments);
        }
    }

}