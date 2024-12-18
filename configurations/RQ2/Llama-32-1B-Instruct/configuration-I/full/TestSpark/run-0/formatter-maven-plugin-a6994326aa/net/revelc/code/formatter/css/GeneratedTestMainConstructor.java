package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMainConstructor {

    @Test
    public void testMainConstructor() {
        Main main = new Main();
        assertThat(main.getClass(), is(Main.class));
    }

}