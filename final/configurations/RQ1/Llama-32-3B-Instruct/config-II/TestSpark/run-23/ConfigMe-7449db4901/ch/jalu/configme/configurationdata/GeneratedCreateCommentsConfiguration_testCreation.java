package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedCreateCommentsConfiguration_testCreation {

    @Test
    public void createCommentsConfiguration_testCreation() {
        // Arrange: setup the expected comment map
        Map<String, List<String>> commentsMap = new HashMap<>();
        List<String> commentLines1 = Arrays.asList("Comment1", "Line2");
        List<String> commentLines2 = Arrays.asList("AnotherComment", "Line3");

        // Act: construct a CommentsConfiguration instance with the given comment map
        CommentsConfiguration commentsConfigWithComments = new CommentsConfiguration(commentsMap);

        // Assert: check that the map has been correctly constructed
        assertEquals(commentLines1, commentsConfigWithComments.comments.get("path1"));
        assertEquals(commentLines2, commentsConfigWithComments.comments.get("path2"));
    }

}