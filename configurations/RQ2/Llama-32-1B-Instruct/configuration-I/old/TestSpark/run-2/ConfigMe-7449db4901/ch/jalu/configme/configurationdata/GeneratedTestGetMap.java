package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetMap {

    @Test
    public void testGetMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList());
        comments.put("path2", Arrays.asList());

        when(getAllComments()).thenReturn(comments);

        assertEquals(comments, getAllComments());
    }

}