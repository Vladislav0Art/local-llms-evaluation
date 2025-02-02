package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsUnmodifiableTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void getAllCommentsUnmodifiableTest() {
        String path = "path";
        String commentLine1 = "comment line 1";

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLine1);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.size());
    }

}