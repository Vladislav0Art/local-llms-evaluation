package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAllCommentsWithNullPath {

    @Test
    public void testGetAllCommentsWithNullPath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        assertEquals(Map.of(), Main.getAllComments(null, null));
    }

}