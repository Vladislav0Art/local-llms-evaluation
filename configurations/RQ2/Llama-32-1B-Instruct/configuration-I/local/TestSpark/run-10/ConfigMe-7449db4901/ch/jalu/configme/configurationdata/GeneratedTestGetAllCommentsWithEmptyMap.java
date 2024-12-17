package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAllCommentsWithEmptyMap {

    @Test
    public void testGetAllCommentsWithEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments(null, null));
    }

}