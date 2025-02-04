package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.comments);
    }

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.comments);
    }

    @Test
    public void setCommentTestEmptyLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"#line1"};
        configuration.setComment(path, commentLines);
        List<String> expectedCommentLines = Arrays.asList("#line1");
        assertEquals(expectedCommentLines, configuration.comments.get(path));
    }

    @Test
    public void setCommentTestEmptyLineResultingInEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"\n"};
        configuration.setComment(path, commentLines);
        assertEquals(1, configuration.comments.get(path).size());
    }

    @Test
    public void setCommentTestMultipleCommentsForSamePath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"#line1", "#line2"};
        configuration.setComment(path, commentLines);
        List<String> expectedCommentLines = Arrays.asList("#line1", "#line2");
        assertEquals(expectedCommentLines, configuration.comments.get(path));
    }

    @Test
    public void setCommentTestNewPath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"#line1"};
        configuration.setComment(path, commentLines);
        assertNull(configuration.comments.get("new_path"));
    }

    @Test
    public void getAllCommentsTestReturnsReadOnlyMapView() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = Collections.unmodifiableMap(new HashMap<>());
        assertEquals(expectedComments, configuration.getAllComments());
    }

}