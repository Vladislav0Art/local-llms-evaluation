package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetCommentOverrideExistingCommentTest {

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

}