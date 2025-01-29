package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedGetAllCommentsReturnsCorrectly {

    @BeforeClass
    public static void setUp() {
        TestUtils.reset();
    }

    @Test
    public void getAllCommentsReturnsCorrectly() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Collections.singletonList("", "", "Hello World!"));

        Map<String, List<String>> actualComments = CommentsConfiguration.getAllComments();

        TestUtils.assertMapEquals(expectedComments, actualComments);
    }

}