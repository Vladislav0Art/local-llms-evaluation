package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_setsNewLinesCorrectly_testSetMultipleLineComments {

    @Test
    public void setComment_setsNewLinesCorrectly_testSetMultipleLineComments() {
        // Arrange: setup the expected comment map with multiple lines comments
        Map<String, List<String>> commentsMap = new HashMap<>();
        List<String> commentLines1 = Arrays.asList("Comment1", "Line2");
        List<String> commentLines2 = Arrays.asList("AnotherComment", "Line3");

        CommentsConfiguration commentsConfigWithComments = new CommentsConfiguration(commentsMap);

        // Act: set the comment lines for the given path
        commentsConfigWithComments.setComment("path1", commentLines1.get(0), commentLines2.get(0));

        // Assert: check that the correct lines have been added to the map
        assertEquals(Arrays.asList(commentLines1.get(0), commentLines2.get(0)), commentsConfigWithComments.comments.get("path1"));
    }

}