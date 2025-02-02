package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class GeneratedTestIsCommentsEmpty {

    public List<String> getComments() {
        return Arrays.asList("line1", "line2");
    }

    public boolean isCommentsEmpty() {
        return this.getComments().isEmpty();
    }
}

class GeneratedTest {

    @Mock
    private CommentsConfiguration commentsConfig;

    @Test
    public void testIsCommentsEmpty() {
        Mockito.when(commentsConfig.getComments()).thenReturn(Collections.emptyList());
        assertTrue(commentsConfig.isCommentsEmpty());
    }

}