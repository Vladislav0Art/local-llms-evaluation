package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsPathCommentsWithEmptyLine {

    @Test
    public void setCommentSetsPathCommentsWithEmptyLine() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "\n\n");
        assertEquals(1, commentsMap.size());
        assertNotNull(commentsMap.get("path"));
        assertTrue((Boolean) commentsMap.get("path").contains("\n"));
    }

}