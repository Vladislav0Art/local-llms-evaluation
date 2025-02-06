package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class GeneratedSetComment_multipleEntries {

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

}