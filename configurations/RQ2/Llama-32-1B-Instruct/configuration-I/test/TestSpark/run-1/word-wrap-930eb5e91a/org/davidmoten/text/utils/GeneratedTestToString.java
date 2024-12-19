package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
public class GeneratedTestToString {

    @Test
    public void testToString() {
        String s = "Hello";
        assertThat(Splitter.on(" ").toCharArray().toString(), is(s));
    }

}