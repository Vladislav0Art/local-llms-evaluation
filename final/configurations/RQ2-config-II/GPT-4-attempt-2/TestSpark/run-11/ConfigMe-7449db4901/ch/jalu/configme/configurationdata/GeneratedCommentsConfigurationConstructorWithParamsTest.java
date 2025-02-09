package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentsConfigurationConstructorWithParamsTest {

    @Test
    public void commentsConfigurationConstructorWithParamsTest() {
        Map<String, List<String>> data = new HashMap<>();
        data.put("config", Arrays.asList("line1", "line2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(data);

        assertEquals(data, commentsConfiguration.getAllComments());
    }

}