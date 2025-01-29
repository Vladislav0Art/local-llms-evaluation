package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedSetCommentSetsCorrectly {

    @BeforeClass
    public static void setUp() {
        TestUtils.reset();
    }

    @Test
    public void setCommentSetsCorrectly() {
        String path = "path";
        String[] commentLines = {"", "", "Hello World!"};

        List<String> actualCommentLines = CommentsConfiguration.setComment(path, commentLines);

        TestUtils.assertListEquals(Arrays.asList("", "Hello World!"), actualCommentLines);
    }

}