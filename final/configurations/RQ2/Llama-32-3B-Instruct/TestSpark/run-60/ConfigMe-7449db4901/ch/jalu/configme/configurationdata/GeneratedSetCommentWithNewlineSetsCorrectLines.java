package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithNewlineSetsCorrectLines {

    @Test
    public void setCommentWithNewlineSetsCorrectLines() {
        // Arrange:
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Collections.singletonList("line1");
        String newline = System.lineSeparator();

        // Act:
        config.setComment(path, newLine);

        // Assert:
        Map<String, @UnmodifiableView List<String>> comments = config.getAllComments();
        assertTrue(comments.containsKey(path));
        assertEquals(0, comments.get(path).size());
    }

}