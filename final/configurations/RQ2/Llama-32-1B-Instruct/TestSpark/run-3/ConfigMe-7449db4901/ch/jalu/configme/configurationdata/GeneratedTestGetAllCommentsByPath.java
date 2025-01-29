package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

public class GeneratedTestGetAllCommentsByPath {

    @Mock
    public Map<String, List<String>> getComments() {
        return new HashMap<>();
    }

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

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

}