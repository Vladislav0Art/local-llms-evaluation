package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void getAllCommentsTest() {
        String path1 = "path 1";
        String commentLine11 = "comment line 11";
        String commentLine12 = "comment line 12";

        String path2 = "path 2";
        String commentLine21 = "comment line 21";
        String commentLine22 = "comment line 22";

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path1, commentLine11, commentLine12);
        commentsConfiguration.setComment(path2, commentLine21, commentLine22);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        Mockito.verify(commentsMap).containsEntry(path1, Mockito.any(List.class));
        Mockito.verify(commentsMap).containsEntry(path2, Mockito.any(List.class));

        assertEquals(2, allComments.size());
    }

}