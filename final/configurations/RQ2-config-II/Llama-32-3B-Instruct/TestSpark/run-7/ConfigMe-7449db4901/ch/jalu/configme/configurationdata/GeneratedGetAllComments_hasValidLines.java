package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedGetAllComments_hasValidLines {

    @Test
    public void getAllComments_hasValidLines() {
        // given
        String path = "path";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Arrays.asList("line1", "line2"));

        CommentsConfiguration config = new CommentsConfiguration(comments);

        // when
        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();

        // then
        assertEquals(1, allComments.size());
        assertTrue(allComments.get(path).containsAll(Arrays.asList("line1", "line2")));
    }

}