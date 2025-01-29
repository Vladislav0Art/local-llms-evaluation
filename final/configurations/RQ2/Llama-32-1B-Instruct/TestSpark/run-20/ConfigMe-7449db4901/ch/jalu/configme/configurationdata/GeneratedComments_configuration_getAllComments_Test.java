package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_getAllComments_Test {

    public void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_getAllComments_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build();
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("comment1\ncomment2"));
        config.setComment("path", "comment3");
        assertEquals(expected, configuration.getAllComments());
    }

}