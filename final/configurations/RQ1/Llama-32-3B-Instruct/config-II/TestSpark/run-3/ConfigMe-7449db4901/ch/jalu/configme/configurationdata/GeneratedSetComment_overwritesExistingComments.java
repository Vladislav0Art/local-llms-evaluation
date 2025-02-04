package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_overwritesExistingComments {

    @Test
    public void setComment_overwritesExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1", "\n", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, "newComment1", "newComment2");
        assertEquals(Collections.singletonList("newComment1"), config.comments.get(path));
    }

}