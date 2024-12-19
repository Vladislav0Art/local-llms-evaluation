package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_SingleLineTest {

    @Test
    public void setComment_SingleLineTest() {
        Map<String, List<String>> map = new HashMap<>();
        String comment = "line1";
        map.put("path", Arrays.asList(comment));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comment);

        assertEquals(0L, map.get("path").size(), 1);
    }

}