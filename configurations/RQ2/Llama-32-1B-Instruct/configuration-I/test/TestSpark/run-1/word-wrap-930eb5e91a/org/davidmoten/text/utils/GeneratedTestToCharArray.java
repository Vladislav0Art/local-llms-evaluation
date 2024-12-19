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
public class GeneratedTestToCharArray {

    @Test
    public void testToCharArray() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        List<String> words = Arrays.asList("hello");
        String s = Splitter.on("\\s+").toSequenceTokenizer().nextToken(words);
        assertThat(new String(chars), is(s));
    }

}