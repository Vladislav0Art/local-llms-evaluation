package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllComments_empty_comments_map_test {

    @Mock
    private Map<String, List<String>> commentsMap;

    @org.junit.Before
    public void setup() {
        this.commentsMap = Mockito.mock(Map.class);
    }

    @Test
    public void getAllComments_empty_comments_map_test() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        Mockito.verify(allComments).isEmpty();
    }

}