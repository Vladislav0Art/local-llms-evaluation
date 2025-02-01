package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

public class GeneratedConstructorWithParamsInitializesGivenCommentMapTest {

    @Test
    public void constructorWithParamsInitializesGivenCommentMapTest() {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("comment1", "comment2"), config.getAllComments().get("path1"));
    }

}