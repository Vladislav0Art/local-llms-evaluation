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
public class GeneratedGetAllComments_with_unmodifiable_comments_map_test {

    @Mock
    private Map<String, List<String>> commentsMap;

    @org.junit.Before
    public void setup() {
        this.commentsMap = Mockito.mock(Map.class);
    }

    @Public
    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(commentsMap);
    }

    @Test
    public void getAllComments_with_unmodifiable_comments_map_test() {
        CommentsConfiguration commentsConfiguration = getCommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", new ArrayList<>());
        commentsConfiguration.commentsMap = map;
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        Mockito.verify(allComments).containsKey("path").verify(allComments.get("path"), Mockito.equals(new ArrayList<>())).isEmpty();
    }

}