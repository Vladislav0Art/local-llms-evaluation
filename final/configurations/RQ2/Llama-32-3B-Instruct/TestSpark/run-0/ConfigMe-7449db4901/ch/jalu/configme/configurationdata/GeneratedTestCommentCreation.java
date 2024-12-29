package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentCreation {

    @Test
    public void testCommentCreation() {
        public class CommentClass {
            private String comment;

            public CommentClass(String comment) {
                this.comment = comment;
            }

            public String getComment() {
                return comment;
            }
        }

        CommentClass comment = new CommentClass("testComment");
        System.out.println(comment.getComment());
    }

}