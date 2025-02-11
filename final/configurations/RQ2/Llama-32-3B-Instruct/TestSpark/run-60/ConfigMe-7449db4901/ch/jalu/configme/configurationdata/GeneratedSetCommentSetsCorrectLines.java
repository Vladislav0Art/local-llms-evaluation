package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsCorrectLines {

    @Test
    public void setCommentSetsCorrectLines() {
        // Arrange:
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Collections.singletonList("line1");

        // Act:
        config.setComment(path, commentLines);

        // Assert:
        Map<String, @UnmodifiableView List<String>> comments = config.getAllComments();
        assertTrue(comments.containsKey(path));
        assertEquals(commentLines, comments.get(path));
    }

}