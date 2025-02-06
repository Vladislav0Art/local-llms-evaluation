package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        assertTrue(cfg.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_hasCommentLines() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        assertEquals(1, cfg.getAllComments().size());
        assertTrue(cfg.getAllComments().containsValue(Arrays.asList("line1", "line2")));
    }

    @Test
    public void setComment_emptyLine() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1"));
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        String path = "path1";
        String[] commentLines = {""};
        cfg.setComment(path, commentLines);
        assertEquals(0, cfg.getAllComments().get(path).size());
    }

    @Test
    public void setComment_newEntry() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        CommentConfigurationTestHelper helper = new CommentConfigurationTestHelper(commentLinesMap);
        CommentsConfiguration cfg = helper.getCommentsConfiguration();
        String path = "path1";
        String[] commentLines = {"line1", "line2"};
        cfg.setComment(path, commentLines);
        assertEquals(1, cfg.getAllComments().size());
        assertTrue(cfg.getAllComments().containsValue(Arrays.asList("line1", "line2")));
    }

    @Test
    public void setComment_multipleEntries() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        CommentConfigurationTestHelper helper = new CommentConfigurationTestHelper(commentLinesMap);
        CommentsConfiguration cfg = helper.getCommentsConfiguration();
        String path = "path1";
        String[] commentLines = {"line1", ""};
        cfg.setComment(path, commentLines);
        assertEquals(2, cfg.getAllComments().size());
        assertTrue(cfg.getAllComments().containsValue(Arrays.asList("line1")));
    }

    @Test
    public void getAllComments_emptyPath() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        String path = "path2";
        assertEquals(Collections.emptyList(), cfg.getAllComments().get(path));
    }

    @Test
    public void getAllComments_nonEmptyPath() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        String path = "path1";
        assertEquals(1, cfg.getAllComments().size());
        assertTrue(cfg.getAllComments().containsValue(Arrays.asList("line1", "line2")));
    }

}

class CommentConfigurationTestHelper {
    private Map<String, List<String>> commentLinesMap;

    public CommentConfigurationTestHelper(Map<String, List<String>> commentLinesMap) {
        this.commentLinesMap = commentLinesMap;
    }

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(commentLinesMap);
    }

}