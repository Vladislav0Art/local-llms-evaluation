package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsUnmodifiableList {

    @Test
    public void getAllCommentsReturnsUnmodifiableList() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "comment");
        Map<String, @UnmodifiableView List<String>> map = commentsConfig.getAllComments();
        assertTrue(map instanceof java.util.HashMap);
        assertEquals(1, ((java.util.HashMap) map).size());
        assertNotNull(((java.util.HashMap) map).get("path"));
        assertTrue((Boolean) ((java.util.HashMap) map).get("path").contains("comment"));
    }

}