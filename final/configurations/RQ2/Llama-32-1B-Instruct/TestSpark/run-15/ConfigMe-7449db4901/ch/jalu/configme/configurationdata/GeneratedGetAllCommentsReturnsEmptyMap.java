package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedGetAllCommentsReturnsEmptyMap {

    @BeforeClass
    public static void setUp() {
        TestUtils.reset();
    }

    @Test
    public void getAllCommentsReturnsEmptyMap() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Collections.emptyList());

        Map<String, List<String>> actualComments = CommentsConfiguration.getAllComments();

        TestUtils.assertMapEquals(expectedComments, actualComments);
    }

}