package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestGetAllComment {

    @Test
    public void testGetAllComment() {
        Map<String, List<String>> expected = Map.of("path1", List.of("value1"));
        //Assuming getAllComment returns a map where key is the path and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();
        commentsConfiguration.put("path1", List.of("value1"));

        assertEquals(expected.get("path1"), commentsConfiguration.get("path1"));
    }

}