package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAllCommentsWithNullListAndEmptyMap {

    @Test
    public void testGetAllCommentsWithNullListAndEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments("path1", comments));
    }

}