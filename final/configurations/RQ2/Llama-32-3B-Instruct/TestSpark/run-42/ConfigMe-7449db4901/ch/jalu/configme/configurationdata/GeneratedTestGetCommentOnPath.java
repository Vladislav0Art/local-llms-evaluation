package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GeneratedTestGetCommentOnPath {


    private CommentsConfiguration config;

    @BeforeEach
    void setup() {
        // Initialize the configuration with default values.
        Set<String> paths = new HashSet<>(Arrays.asList("path1", "path2"));
        List<List<String>> comments = Arrays.asList(Arrays.asList("line1", "line2"), Arrays.asList("line3", "line4"));

        config = new CommentsConfiguration();
        config.setPaths(paths);
        config.setComments(comments);

    }

    @Test
    public void testGetCommentOnPath() {
        assertEquals(1, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

}