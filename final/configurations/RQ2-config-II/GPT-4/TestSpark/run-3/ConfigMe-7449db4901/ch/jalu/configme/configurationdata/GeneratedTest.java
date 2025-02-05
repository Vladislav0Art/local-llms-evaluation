package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.UnmodifiableView;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        List<String> comments = Arrays.asList("comment1", "comment2");
        commentMap.put("key", comments);

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(commentsConfiguration.getAllComments().get("key"), comments);
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments = {"comment1", "comment2"};

        commentsConfiguration.setComment("key", comments);
        assertEquals(commentsConfiguration.getAllComments().get("key"), Arrays.asList(comments));
    }

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        List<String> oldComments = Arrays.asList("old1", "old2");
        commentMap.put("key", oldComments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        String[] newComments = {"new1", "new2"};

        commentsConfiguration.setComment("key", newComments);
        assertEquals(commentsConfiguration.getAllComments().get("key"), Arrays.asList(newComments));
    }

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "comment1");
    }

    @Test
    public void setCommentNullLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("key", null);
    }

    @Test
    public void getAllCommentsImmutableMapTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments = {"comment1", "comment2"};

        commentsConfiguration.setComment("key", comments);

        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        allComments.put("illegalKey", Arrays.asList("illegalValue"));
    }

    @Test
    public void getAllCommentsImmutableListTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments = {"comment1", "comment2"};

        commentsConfiguration.setComment("key", comments);

        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        allComments.get("key").add("illegalValue");
    }

}