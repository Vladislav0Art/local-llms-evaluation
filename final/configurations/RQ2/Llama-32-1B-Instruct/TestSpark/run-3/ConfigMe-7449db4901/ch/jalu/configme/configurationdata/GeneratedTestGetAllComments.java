package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

public class GeneratedTestGetAllComments {

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

}