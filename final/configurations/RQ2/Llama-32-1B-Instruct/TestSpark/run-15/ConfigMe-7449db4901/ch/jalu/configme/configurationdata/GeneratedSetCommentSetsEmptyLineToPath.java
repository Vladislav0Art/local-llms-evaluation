package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedSetCommentSetsEmptyLineToPath {

    @BeforeClass
    public static void setUp() {
        TestUtils.reset();
    }

    @Test
    public void setCommentSetsEmptyLineToPath() {
        String path = "";
        String...commentLines = {};

        List<String> actualCommentLines = CommentsConfiguration.setComment(path, commentLines);

        TestUtils.assertListEquals(Arrays.asList("", "Hello World!"), actualCommentLines);
    }

}