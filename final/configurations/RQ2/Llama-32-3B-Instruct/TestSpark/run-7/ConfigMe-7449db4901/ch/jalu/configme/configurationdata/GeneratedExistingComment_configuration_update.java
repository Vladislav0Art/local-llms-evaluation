package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedExistingComment_configuration_update {

    @Test
    public void existingComment_configuration_update() {
        Map<String, List<String>> comments = new HashMap<String, List<String>>() {
            {
                put("", Arrays.asList(""))
            }

            ;

            put("key",Arrays.asList("$"));
        }
    }

    ;
    CommentsConfiguration config = new CommentsConfiguration(comments);
		config.setComment("key","value");
    Map<String, List<String>> expectedMap = new HashMap<>();
		expectedMap.put("key",Collections.singletonList("value"));

    assertThat(config.getAllComments(),is(expectedMap));
}

}