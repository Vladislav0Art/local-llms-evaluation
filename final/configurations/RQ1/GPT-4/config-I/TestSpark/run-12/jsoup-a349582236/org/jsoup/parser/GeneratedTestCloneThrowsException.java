package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedTestCloneThrowsException {

    @Test
    public void testCloneThrowsException() {
        Tag t = new Tag("p") {
            @Override
            public Tag clone() {
                try {
                    throw new CloneNotSupportedException();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t.clone();
    }

}