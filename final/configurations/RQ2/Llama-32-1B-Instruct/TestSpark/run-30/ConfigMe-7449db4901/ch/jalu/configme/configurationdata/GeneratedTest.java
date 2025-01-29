package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfigurationImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTest {

    @ParameterizedTest
    @CsvSource({"", "1\n2\n3", "1 2 3"})
    void testSetComment(String[] commentLines, String path) {
        SettingsHolder settings = new SettingsHolder();
        CommentsConfigurationImpl commentsConfig = new CommentsConfigurationImpl(settings);
        commentsConfig.setComment(path, commentLines);
        Assertions.assertTrue(Arrays.asList(commentLines).contains("1\n2\n3"));
    }

    @Test
    public void testGetAllComments() {
        SettingsHolder settings = new SettingsHolder();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList(""));
        commentsConfig = new CommentsConfigurationImpl(settings);
        commentsConfig.setComment("path", "1\n2\n3");
        Assertions.assertIsSame(comments, commentsConfig.getAllComments());
    }

}