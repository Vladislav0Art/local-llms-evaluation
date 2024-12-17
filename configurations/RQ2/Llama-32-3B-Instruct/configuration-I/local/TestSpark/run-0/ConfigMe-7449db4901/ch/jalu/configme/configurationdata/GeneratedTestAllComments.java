package ch.jalu.configme.configurationdata;

public class GeneratedTestAllComments {

    private java.util.HashMapjava.lang.String,java.util.Listjava.lang.String>>comments;

    public void setPath(String key, String value) {
        if (comments == null) {
            comments = new java.util.HashMap > ();
        }
        comments.put(key, java.util.Arrays.asList(value));
    }

    public String getComment(String path) {
        return comments.get(path);
    }

    public java.util.Mapjava.lang.String,java.util.Listjava.lang.String>>

    getAllComments() {
        return comments;
    }
}

class TestCommentsConfiguration {
    private CommentsConfiguration config;

    public TestCommentsConfiguration(CommentsConfiguration config) {
        this.config = config;
    }

    @Test
    public void testAllComments() {
        config.setPath("path1", "comment1");
        assertEquals(1, config.getAllComments().size());
        assertEquals("comment1", ((java.util.Map) config.getAllComments()).get("path1"));
    }

}