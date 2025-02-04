package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setsNewLinesCorrectly_testSetSingleLineComment {

    @Test
    public void setComment_setsNewLinesCorrectly_testSetSingleLineComment() {
        // Arrange: setup the expected comment map with a single line comment
        Map<String, List<String>> commentsMap = new HashMap<>();
        List<String> commentLines1 = Arrays.asList("Comment1", "\n");

        CommentsConfiguration commentsConfigWithComments = new CommentsConfiguration(commentsMap);

        // Act: set the comment lines for the given path
        commentsConfigWithComments.setComment("path1", commentLines1.get(0));

        // Assert: check that the correct line has been added to the map
        assertEquals(Collections.singletonList(commentLines1.get(0)), commentsConfigWithComments.comments.get("path1"));
    }

}