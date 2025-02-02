package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String value;

    public CommentLine1(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class CommentLine2 {
    private String value;

    public CommentLine2(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class CommentsConfigurationTest {

    @Before
    public void setUp() {
        commentLine1 = new CommentLine1("line1");
        commentLine2 = new CommentLine2("line2");
    }

    private CommentLine1 commentLine1;
    private CommentLine2 commentLine2;

}