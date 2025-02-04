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
public class GeneratedGetAllComments_MultipleEntries {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_MultipleEntries() {
        Map<String, List<String>> commentMap = createCommentMap("testPath1", Collections.singletonList("comment1"), "testPath2", Collections.singletonList("comment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentMap);
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertEquals(2, allComments.size());
    }

    private void assertIsEmpty(Map<String, List<String>> map) {
        assertEquals(0, map.size());
        for (List<String> list : map.values()) {
            assertEquals(0, list.size());
        }
    }

    private Map<String, List<String>> createCommentMap(String... paths) {
        Map<String, List<String>> commentMap = new HashMap<>();
        for (String path : paths) {
            commentMap.put(path, Collections.singletonList("comment"));
        }
        return commentMap;
    }

}