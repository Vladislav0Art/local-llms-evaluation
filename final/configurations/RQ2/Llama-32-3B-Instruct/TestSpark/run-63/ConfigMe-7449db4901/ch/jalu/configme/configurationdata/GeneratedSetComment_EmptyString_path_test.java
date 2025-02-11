package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedSetComment_EmptyString_path_test {

    @Test
    public void setComment_EmptyString_path_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path1", "");
        assertEquals(Collections.singletonMap("path1", Collections.emptyList()), config.getAllComments());
    }

}