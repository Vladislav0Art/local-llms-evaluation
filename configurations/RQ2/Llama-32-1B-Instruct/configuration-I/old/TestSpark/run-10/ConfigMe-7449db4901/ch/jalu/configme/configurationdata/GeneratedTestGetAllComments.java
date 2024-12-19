package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        assertEquals(Map.of("path1", Collections.singletonList("line1"), "path2", Arrays.asList("line2")), Main.getAllComments("path1", "path2"));
    }

}