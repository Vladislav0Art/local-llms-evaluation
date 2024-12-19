package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentInvalidPath {

    @Test
    public void setCommentInvalidPath() {
        String[][] comments = {"line1\ncomment1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configurer.setComment("another path", "line3");

        assertEquals(0L, map.get("path").size(), 1);
    }

}