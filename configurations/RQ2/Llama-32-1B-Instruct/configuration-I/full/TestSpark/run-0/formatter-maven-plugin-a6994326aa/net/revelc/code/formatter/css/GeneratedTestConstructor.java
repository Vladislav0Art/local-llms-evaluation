package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        Main main = new Main();
        String toString = Main.toString();
        assertThat(toString, is("Main@..."));
    }

}