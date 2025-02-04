package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_addsNewLineWithoutMarker {

    @Test
    public void setComment_addsNewLineWithoutMarker() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test";
        List<String> commentLines = Arrays.asList("comment1\n", "comment2");
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        config.setComment(path, commentLines.get(0), commentLines.get(1));
        assertEquals(Collections.singletonList(commentLines.get(0)), config.comments.get(path));
    }

}