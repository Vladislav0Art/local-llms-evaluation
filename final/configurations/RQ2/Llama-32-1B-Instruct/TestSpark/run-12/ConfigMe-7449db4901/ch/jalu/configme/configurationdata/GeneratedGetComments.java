package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetComments {

    private Map<String, List<String>> comments = new HashMap<>();
}

public class GeneratedTest {

    @BeforeEach
    public void init() {
        String path = "path";
        String[] commentLinesArray = {"This is a comment\nwith multiple lines"};
        for (String line : commentLinesArray) {
            comments.get(path).add(line);
        }
        this.comments = comments;
    }

    @Test
    public void getComments() {
        assertEquals(Arrays.asList("", "comment1", "", "comment2"), this.comments.get("path"));
    }

}