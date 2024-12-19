package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestContainsKeyMap {

    @Test
    public void testContainsKeyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList());
        comments.put("path2", Arrays.asList());

        when(getAllComments()).thenReturn(comments);

        assertEquals(true, getAllComments().containsKey("path3"));
    }

}