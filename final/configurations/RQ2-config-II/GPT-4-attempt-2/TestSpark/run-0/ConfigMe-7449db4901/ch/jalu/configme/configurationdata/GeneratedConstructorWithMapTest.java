package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path.one", Collections.singletonList("comment one"));
        comments.put("path.two", Collections.singletonList("comment two"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(2, commentsConfiguration.getAllComments().size());
        assertEquals(Collections.singletonList("comment one"), commentsConfiguration.getAllComments().get("path.one"));
        assertEquals(Collections.singletonList("comment two"), commentsConfiguration.getAllComments().get("path.two"));
    }

}