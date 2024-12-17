package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_MultipleLines {

    @Test
    public void setComment_MultipleLines() {
        String[][] comments = {"line1\ncomment1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comments[1]);
        configuration.setComment("another path", "line3\ncomment2");

        assertEquals(0L, map.get("path").size(), 1);
    }

}