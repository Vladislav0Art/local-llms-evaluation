package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithMultipleLinesSetsCorrectLines {

    @Test
    public void setCommentWithMultipleLinesSetsCorrectLines() {
        // Arrange:
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Arrays.asList("line1", "line2");

        // Act:
        config.setComment(path, commentLines);

        // Assert:
        Map<String, @UnmodifiableView List<String>> comments = config.getAllComments();
        assertTrue(comments.containsKey(path));
        assertEquals(commentLines, comments.get(path));
    }

}