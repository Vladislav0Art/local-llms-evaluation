package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_MultipleEntries {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_MultipleEntries() {
        Map<String, List<String>> commentMap = createCommentMap();
        commentsConfiguration = new CommentsConfiguration(commentMap);
        String[] commentLines1 = {"comment1", "comment2"};
        String[] commentLines2 = {"comment3", "comment4"};
        commentsConfiguration.setComment("testPath1", commentLines1);
        commentsConfiguration.setComment("testPath2", commentLines2);
        assertEquals(2, commentsConfiguration.comments.size());
        assertEquals(2, commentsConfiguration.comments.get("testPath1").size());
        assertEquals(2, commentsConfiguration.comments.get("testPath2").size());
    }

}