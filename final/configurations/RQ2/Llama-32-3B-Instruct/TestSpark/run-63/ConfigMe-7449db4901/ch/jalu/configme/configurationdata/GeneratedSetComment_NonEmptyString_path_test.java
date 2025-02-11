package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedSetComment_NonEmptyString_path_test {

    @Test
    public void setComment_NonEmptyString_path_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path1", "new-line");
        assertEquals(Collections.singletonMap("path1", Collections.singletonList("new-line")), config.getAllComments());
    }

}