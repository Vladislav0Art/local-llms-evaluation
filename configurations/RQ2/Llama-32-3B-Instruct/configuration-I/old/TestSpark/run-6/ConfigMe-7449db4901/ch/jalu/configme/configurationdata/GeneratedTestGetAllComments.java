package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> expected = Map.of("key1", List.of("value1"), "key2", List.of("value2"));
        //Assuming getAllComment returns a map where key is the comment id and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("commentId1", List.of("value1"));
        commentsConfiguration.put("commentId2", List.of("value2"));

        assertEquals(expected, commentsConfiguration);
    }

}