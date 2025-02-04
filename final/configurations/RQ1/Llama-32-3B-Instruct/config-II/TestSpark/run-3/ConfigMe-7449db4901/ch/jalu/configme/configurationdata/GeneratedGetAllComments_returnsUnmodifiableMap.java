package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, commentLines.get(0), commentLines.get(1));
        Map<String, @UnmodifiableView List<String>> result = config.getAllComments();
        assertTrue(result instanceof UnmodifiableMap);
    }

}