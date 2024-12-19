package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of("path1", Collections.singletonList("line1"), "path2", Collections.emptyList()), Main.getComments("path1", "path2"));
    }

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        assertEquals(Map.of("path1", Collections.singletonList("line1"), "path2", Arrays.asList("line2")), Main.getAllComments("path1", "path2"));
    }

    @Test
    public void testGetAllCommentsWithNullPath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        assertEquals(Map.of(), Main.getAllComments(null, null));
    }

    @Test
    public void testGetAllCommentsWithEmptyPath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        assertEquals(Map.of(), Main.getAllComments("path1", Collections.emptyList()));
    }

    @Test
    public void testGetAllCommentsWithNullPathAndEmptyList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments(null, Collections.emptyList()));
    }

    @Test
    public void testGetAllCommentsWithNullList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.singletonList("line2"));
        assertEquals(Map.of(), Main.getAllComments("path1", null));
    }

    @Test
    public void testGetAllCommentsWithNullListAndEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments("path1", comments));
    }

    @Test
    public void testGetAllCommentsWithEmptyList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.singletonList("line2"));
        assertEquals(Map.of(), Main.getAllComments("path1", comments));
    }

    @Test
    public void testGetAllCommentsWithNullList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments(null, comments));
    }

    @Test
    public void testGetAllCommentsWithNullPathAndEmptyList() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments(null, null));
    }

    @Test
    public void testGetAllCommentsWithNullPathAndEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments(null, comments));
    }

    @Test
    public void testGetAllCommentsWithEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.emptyList());
        assertEquals(Map.of(), Main.getAllComments(null, null));
    }

}