package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        comments.put("path2", Collections.singletonList("line3"));

        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

}