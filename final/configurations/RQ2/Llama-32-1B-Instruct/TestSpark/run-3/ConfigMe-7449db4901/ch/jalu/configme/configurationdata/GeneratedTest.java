package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

public class GeneratedTest {

    @Mock
    public Map<String, List<String>> getComments() {
        return new HashMap<>();
    }

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllComments() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(comments.getComments()).thenReturn(result);
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("line1", "line2"));
        commentsMap.put("path2", Collections.singletonList(""));
        commentsConfiguration.setComment("path1", "comment");
        commentsConfiguration.setComment("path2", new String[]{});

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertNotNull(result);
        assertEquals(3, result.size());
    }

    @Test
    public void testSetComment() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(comments.getComments()).thenReturn(result);

        commentsConfiguration.setComment("path", Collections.emptyList());
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("line1", "line2"));
        commentsMap.put("path2", new String[]{});
        commentsConfiguration.setComment("path1", "comment");
        commentsConfiguration.setComment("path2", new String[]{});

        assertEquals(3, comments.getComments().size());
    }

    @Test
    public void testGetComment() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(comments.getComments()).thenReturn(result);

        commentsConfiguration.setComment("path", Collections.emptyList());

        assertEquals(null, comments.getComments().get("path"));
    }

    @Test
    public void testGetAllCommentsByPath() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(comments.getComments()).thenReturn(result);

        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("line1"));
        commentsMap.put("path2", Collections.emptyList());

        commentsConfiguration.setComment("path1", commentsMap.get("path1"));
        commentsConfiguration.setComment("path2", commentsMap.get("path2"));

        assertEquals(3, comments.getComments().size());
    }

    @Test
    public void testSetAllCommentsByPath() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(comments.getComments()).thenReturn(result);

        commentsConfiguration.setComment("path1", Collections.emptyList());
        commentsConfiguration.setComment("path2", Arrays.asList("line1"));

        assertEquals(3, comments.getComments().size());
    }

}