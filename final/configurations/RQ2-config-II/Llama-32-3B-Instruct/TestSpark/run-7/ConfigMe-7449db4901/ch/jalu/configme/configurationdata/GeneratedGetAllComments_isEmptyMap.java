package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedGetAllComments_isEmptyMap {

    @Test
    public void getAllComments_isEmptyMap() {
        // given
        Map<String, List<String>> comments = new HashMap<>();

        // when
        CommentsConfiguration config = new CommentsConfiguration(comments);

        // then
        assertTrue(config.getAllComments().isEmpty());
    }

}