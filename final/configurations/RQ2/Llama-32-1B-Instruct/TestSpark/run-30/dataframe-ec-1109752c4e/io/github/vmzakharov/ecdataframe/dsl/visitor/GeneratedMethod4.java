package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedMethod4 {

    @Test
    public void method4() {
        int x = 40;
        String[] y = {"t"};
        String[] z = {"u", "v"};
        int result = generateMethod(x, y, z);
        assertThat(result, is(1));
    }

}