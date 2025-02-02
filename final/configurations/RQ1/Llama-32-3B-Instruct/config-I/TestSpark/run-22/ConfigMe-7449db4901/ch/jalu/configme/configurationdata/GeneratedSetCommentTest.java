package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void setCommentTest() {
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "comment line 2";

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLine1, commentLine2);

        Mockito.verify(commentsMap).put(path, Mockito.any(List.class));
    }

}