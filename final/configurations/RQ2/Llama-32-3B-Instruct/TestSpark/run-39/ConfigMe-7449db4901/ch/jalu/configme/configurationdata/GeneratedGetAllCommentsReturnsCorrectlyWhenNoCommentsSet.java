package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsCorrectlyWhenNoCommentsSet {

    @Test
    public void getAllCommentsReturnsCorrectlyWhenNoCommentsSet() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(0, ((Map) commentsConfig.getAllComments()).size());
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public CommentsConfiguration(Map<String, List<String>> map) {
        this.comments = map;
    }

    public void setComment(String path, String line) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        comments.put(path, Arrays.asList(line));
    }

    public Map<String, List<String>> getAllComments() {
        return comments != null ? comments : Collections.emptyMap();
    }

}