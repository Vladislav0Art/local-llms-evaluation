package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCommentsConfigurationFromMap_isCorrectlyCreated {

    @Test
    public void commentsConfigurationFromMap_isCorrectlyCreated() {
        Map<String, List<String>> map = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(new HashMap<>() {{
            put("path", Arrays.asList("line1", "line2"));
        }}, commentsConfiguration.getAllComments());
    }

}