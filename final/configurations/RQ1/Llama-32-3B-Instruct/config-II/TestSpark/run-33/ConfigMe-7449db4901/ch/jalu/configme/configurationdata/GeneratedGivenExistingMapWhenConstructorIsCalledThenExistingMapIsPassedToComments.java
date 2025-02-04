package ch.jalu.configme.configurationdata;

public class GeneratedGivenExistingMapWhenConstructorIsCalledThenExistingMapIsPassedToComments {

    private static final String PATH = "path";

    @Test
    public void givenExistingMapWhenConstructorIsCalledThenExistingMapIsPassedToComments() {
        Map<String, List<String>> existingMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(existingMap);
        assertSame(existingMap, commentsConfig.comments);
    }

}