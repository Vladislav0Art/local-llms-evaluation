package ch.jalu.configme.configurationdata;

public class GeneratedGivenEmptyMapWhenConstructorIsCalledThenNewMapIsCreated {

    private static final String PATH = "path";

    @Test
    public void givenEmptyMapWhenConstructorIsCalledThenNewMapIsCreated() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedMap = Collections.emptyMap();
        assertEquals(expectedMap, commentsConfig.comments);
    }

}