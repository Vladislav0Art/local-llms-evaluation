package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedTest {

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

    @Test
    public void createCommentsConfiguration_testEmptyCommentMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        assertNotNull(commentsConfig.comments);
    }

    @Test
    public void createCommentsConfiguration_testNoArguments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        assertNull(commentsConfig.comments);
    }

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

    @Test
    public void setComment_setsNewLinesCorrectly_testSetMultipleLineCommentsDifferentPaths() {
        // Arrange: setup the expected comment map with multiple lines comments and different paths
        Map<String, List<String>> commentsMap = new HashMap<>();
        List<String> commentLines1 = Arrays.asList("Comment1", "Line2");
        List<String> commentLines2 = Arrays.asList("AnotherComment", "Line3");

        CommentsConfiguration commentsConfigWithComments = new CommentsConfiguration(commentsMap);

        // Act: set the comment lines for different paths
        commentsConfigWithComments.setComment("path1", commentLines1.get(0), commentLines2.get(0));
        commentsConfigWithComments.setComment("path2", commentLines1.get(0), commentLines2.get(0));

        // Assert: check that each line has been added to its respective path
        assertEquals(Arrays.asList(commentLines1.get(0), commentLines2.get(0)), commentsConfigWithComments.comments.get("path1"));
        assertEquals(Collections.singletonList(commentLines1.get(0)), commentsConfigWithComments.comments.get("path2"));
    }

    @Test
    public void getComments_returnsMap_correctly_testGetAllComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("commentPath", Arrays.asList("CommentedLine"));

        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);

        assertNotNull(commentsConfig.getAllComments());
    }

    @Test
    public void getComments_returnsMap_correctly_testGetAllCommentsEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        assertNotNull(commentsConfig.getAllComments());
    }

}