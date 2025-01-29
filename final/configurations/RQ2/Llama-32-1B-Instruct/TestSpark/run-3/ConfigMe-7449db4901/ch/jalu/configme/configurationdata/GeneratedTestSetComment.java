package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

public class GeneratedTestSetComment {

    @Mock
    public Map<String, List<String>> getComments() {
        return new HashMap<>();
    }

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

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

}