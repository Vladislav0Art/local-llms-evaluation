package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetAllCommentsTest {

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