package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewConstructor_passesCommentsMap {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void newConstructor_passesCommentsMap() {
        Map<String, List<String>> comments = Collections.singletonMap("test", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfig.getComments());
    }

}