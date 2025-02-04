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
public class GeneratedGetAllComments_SingleEntry {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_SingleEntry() {
        Map<String, List<String>> commentMap = createCommentMap("testPath", Collections.singletonList("comment"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentMap);
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertEquals(1, allComments.size());
    }

}