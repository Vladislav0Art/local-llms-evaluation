package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentConstructor InitializesMap {

    public Map<String, List<String>> getComments() {
        return Collections.emptyMap();
    }

    @Test
    public void commentConstructor

    InitializesMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        when(configuration.comments()).thenReturn(Collections.emptyList());
        assert configuration.comments().isEmpty();
    }

}