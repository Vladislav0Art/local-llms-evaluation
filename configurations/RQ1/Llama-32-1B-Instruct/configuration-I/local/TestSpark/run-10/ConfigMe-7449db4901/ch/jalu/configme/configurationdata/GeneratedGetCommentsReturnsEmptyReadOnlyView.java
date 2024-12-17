package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetCommentsReturnsEmptyReadOnlyView {

    public Map<String, List<String>> getComments() {
        return Collections.emptyMap();
    }

    @Test
    public void getCommentsReturnsEmptyReadOnlyView() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        when(configuration.comments()).thenReturn(Collections.emptyMap());
        Map<String, @UnmodifiableView List<String>> comments = configuration.getAllComments();
        assert comments.containsKey(path).isEmpty();
    }

}