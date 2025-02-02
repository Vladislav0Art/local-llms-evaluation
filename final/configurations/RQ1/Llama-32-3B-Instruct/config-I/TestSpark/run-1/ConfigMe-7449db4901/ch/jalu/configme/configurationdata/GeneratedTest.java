package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNull(commentsConfiguration.getComments());
    }

    @Test
    public void constructorWithCommentsMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path1 = "path1";
        List<String> commentLines1 = Arrays.asList("line1", "line2");
        commentsMap.put(path1, commentLines1);

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfiguration.getComments());
    }

    @Test
    public void setCommentSingleLineWithMarkerTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        List<String> commentLines = Arrays.asList("line1#", "line2");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComments(path, 0, "#", 1);
    }

    @Test
    public void setCommentSingleLineWithMarkerTestEqual() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        List<String> commentLines = Arrays.asList("line1#", "line2");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(Arrays.asList("#", ""), commentsConfiguration.getComments().get(path));
    }

    @Test
    public void setCommentSingleLineWithMarkerTestEmpty() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "path";
        List<String> commentLines = Arrays.asList("line1#", "line2");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComments(path, 0, "", 3);
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path1 = "path1";
        List<String> commentLines1 = Arrays.asList("line1#", "line2");
        String path2 = "path2";
        List<String> commentLines2 = Arrays.asList("line3", "#", "line4");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComments(path1, 0, "#", 1);
        commentsConfiguration.setComments(path2, 0, "", 2);
        assertEquals(commentsMap, commentsConfiguration.getComments());
    }

    @Test
    public void getAllCommentsWithEmptyMapTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getComments());
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComments(String path, int lineStart, String marker, int lineEnd) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        List<String> lines = new ArrayList<>(Arrays.asList("", ""));
        lines.add(marker);
        comments.put(path, lines);
    }

}