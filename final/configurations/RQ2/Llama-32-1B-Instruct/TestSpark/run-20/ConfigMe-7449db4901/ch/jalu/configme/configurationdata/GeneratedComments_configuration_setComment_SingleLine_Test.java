package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertEquals;

public class GeneratedComments_configuration_setComment_SingleLine_Test {

    public void assertLinesEqual(String expected, String actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void comments_configuration_setComment_SingleLine_Test() {
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build();
        config.setComment("path", "");
        assertLinesEqual(configuration.getAllComments().get("path"), Collections.singletonList(""));
    }

}