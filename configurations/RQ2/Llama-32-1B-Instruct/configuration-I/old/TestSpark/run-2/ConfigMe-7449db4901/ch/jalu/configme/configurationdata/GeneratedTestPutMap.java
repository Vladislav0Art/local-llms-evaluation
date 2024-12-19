package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestPutMap {

    @Test
    public void testPutMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList());
        comments.put("path2", Arrays.asList());

        when(getAllComments()).thenReturn(comments);

        getAllComments().put("path3", Arrays.asList());
        assertEquals(Arrays.asList("path1", "path2"), getAllComments());
    }

}