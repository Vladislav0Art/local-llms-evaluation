package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCommentsInConfiguration {

    private String comment;

    public CommentClass(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}

public class ConfigClass {
    private String newPath;
    private String newComment;

    public ConfigClass(String newPath, String newComment) {
        this.newPath = newPath;
        this.newComment = newComment;
    }

    public String getNewPath() {
        return newPath;
    }

    public String getNewComment() {
        return newComment;
    }
}

public class Comment {
    private String comment;

    public Comment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class ConfigTest {

    @Test
    public void testCommentsInConfiguration() {
        Map<String, List<Comment>> comments = new HashMap<>();
        comments.put("newPath", Arrays.asList(new Comment("comment")));
        comments.put("path", Arrays.asList(new Comment("comment")));

        ConfigClass config = new ConfigClass(comments);
        assertEquals(2, config.getComments().size());
    }

}