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
public class GeneratedGetAllComments_EmptyMap {

    @Mock
    private Map<String, List<String>> commentsMap;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllComments_EmptyMap() {
        Map<String, List<String>> commentMap = Collections.emptyMap();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentMap);
        assertIsEmpty(commentsConfig.getAllComments());
    }

}