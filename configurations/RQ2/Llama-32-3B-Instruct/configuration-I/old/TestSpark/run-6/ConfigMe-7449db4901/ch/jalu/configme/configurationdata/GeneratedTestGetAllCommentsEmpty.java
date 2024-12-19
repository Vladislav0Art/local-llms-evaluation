package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestGetAllCommentsEmpty {

    @Test
    public void testGetAllCommentsEmpty() {
        Map<String, List<String>> expected = Map.of();
        //Assuming getAllComment returns a map where key is the comment id and value is list of strings
        Map<String, List<String>> commentsConfiguration = new HashMap<>();

        assertEquals(expected, commentsConfiguration);
    }

}