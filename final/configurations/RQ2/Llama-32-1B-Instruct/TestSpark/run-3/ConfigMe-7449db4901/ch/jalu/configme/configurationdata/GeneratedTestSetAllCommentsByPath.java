package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

public class GeneratedTestSetAllCommentsByPath {

    @Mock
    public Map<String, List<String>> getComments() {
        return new HashMap<>();
    }

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetAllCommentsByPath() {
        CommentsConfiguration.Result result = new CommentsConfiguration.Result();
        when(comments.getComments()).thenReturn(result);

        commentsConfiguration.setComment("path1", Collections.emptyList());
        commentsConfiguration.setComment("path2", Arrays.asList("line1"));

        assertEquals(3, comments.getComments().size());
    }

}