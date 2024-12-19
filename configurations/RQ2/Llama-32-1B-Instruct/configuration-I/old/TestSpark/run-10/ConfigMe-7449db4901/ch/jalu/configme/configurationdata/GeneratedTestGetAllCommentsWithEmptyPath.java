package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAllCommentsWithEmptyPath {

    @Test
    public void testGetAllCommentsWithEmptyPath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        assertEquals(Map.of(), Main.getAllComments("path1", Collections.emptyList()));
    }

}