package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    public String comment() {
        return null;
    }

    public List<String> comments = new ArrayList<>();
}

class TestMethod {
    public String comment() {
        return "";
    }

    public void setComment(String comment, List<String> comments) {
        if (comment == null) {
            comments.add(null);
        } else {
            comments.add(comment);
        }
    }

}