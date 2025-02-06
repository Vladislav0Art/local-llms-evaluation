package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationHasEmptyMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

    @Test
    public void newCommentsConfigurationFromHashMapIsUnmodifiableView() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().equals(comments));
    }

    @Test
    public void setCommentSetsAllLinesForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build(comments).build();
        String path = "path";
        String[] commentLines = {"comment1", "comment2"};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), configuration.getAllComments().get(path));
    }

    @Test
    public void setCommentSetsNewLineAsEmptyString() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build(comments).build();
        String path = "path";
        String[] commentLines = {"comment1", "", "comment3"};
        configuration.setComment(path, commentLines);
        assertEquals(Collections.singletonList(commentLines[0]), configuration.getAllComments().get(path));
    }

    @Test
    public void setCommentSetsMultiplePaths() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build(comments).build();
        String path1 = "path1";
        String[] commentLines1 = {"comment11", "comment12"};
        String path2 = "path2";
        String[] commentLines2 = {"comment21", "comment22"};
        configuration.setComment(path1, commentLines1);
        configuration.setComment(path2, commentLines2);
        assertEquals(Arrays.asList(commentLines1), configuration.getAllComments().get(path1));
        assertEquals(Arrays.asList(commentLines2), configuration.getAllComments().get(path2));
    }

}