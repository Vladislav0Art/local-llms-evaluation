package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetCommentsReturnsReadOnlyView {

    public Map<String, List<String>> getComments() {
        return Collections.emptyMap();
    }

    @Test
    public void getCommentsReturnsReadOnlyView() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines = Arrays.asList("comment1\n", "comment2");
        when(configuration.comments()).thenReturn(Collections.singletonMap(path, Collections.singletonList(commentLines)));
        Map<String, @UnmodifiableView List<String>> comments = configuration.getAllComments();
        assert comments.containsKey(path).isNotEmpty();
    }

}