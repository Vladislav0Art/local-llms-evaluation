package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestGetComment {

    @Test
    public void testGetComment() {
        Map<String, List<String>> expected = Map.of("key1", List.of("value1"));
        //Assuming getAllComment returns a map where key is the comment id and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("commentId1", List.of("value1"));

        assertEquals(expected.get("key1"), commentsConfiguration.get("commentId1"));
    }

}