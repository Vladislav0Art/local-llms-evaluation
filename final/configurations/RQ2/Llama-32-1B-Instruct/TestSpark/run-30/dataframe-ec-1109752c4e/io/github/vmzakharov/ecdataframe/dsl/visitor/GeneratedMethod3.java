package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedMethod3 {

    @Test
    public void method3() {
        int x = 30;
        String[] y = new String[]{"f", "g"};
        String[] z = new String[]{"h", "i"};
        int result = generateMethod(x, y, z);
        assertThat(result, is(0));
    }

}