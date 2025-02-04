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
public class GeneratedSetComment_OneEntry {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_OneEntry() {
        Map<String, List<String>> commentMap = createCommentMap();
        commentsConfiguration = new CommentsConfiguration(commentMap);
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.setComment("testPath", commentLines);
        assertEquals(1, commentsConfiguration.comments.size());
        assertEquals(2, commentsConfiguration.comments.get("testPath").size());
    }

}