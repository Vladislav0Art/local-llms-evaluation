package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetCommentTest {

    @Test
    public void getCommentTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        java.util.Arrays.setAll(java.util.Arrays.asList("commentLine1", "commentLine2"), i -> commentsConfiguration.setComment("path1", "commentLine" + i));
        assertEquals(commentsConfiguration.getComment("path1").toString(), "commentLine0");
    }
}

public class CommentsConfiguration {
    public List<String> getComment(String path) {
        return new ArrayList<>();
    }

    public void setComment(String path, String comment) {
    }

}