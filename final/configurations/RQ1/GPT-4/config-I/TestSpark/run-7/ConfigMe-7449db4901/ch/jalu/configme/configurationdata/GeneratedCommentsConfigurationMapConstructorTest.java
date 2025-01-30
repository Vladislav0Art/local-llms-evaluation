package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertNotNull(commentsConfiguration);
    }

}