package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path.test", Arrays.asList("Test Comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("Test Comment", commentsConfiguration.getAllComments().get("path.test").get(0));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path.test", "Sample Comment");
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("Sample Comment", commentsConfiguration.getAllComments().get("path.test").get(0));
    }

    @Test
    public void setCommentOverrideExistingCommentTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path.test", Arrays.asList("Old Comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path.test", "New Comment");
        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals("New Comment", commentsConfiguration.getAllComments().get("path.test").get(0));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path.test", Arrays.asList("Comment1", "Comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> commentsMap = commentsConfiguration.getAllComments();
        assertNotNull(commentsMap);
        assertEquals(1, commentsMap.size());
        assertEquals(2, commentsMap.get("path.test").size());
    }

}