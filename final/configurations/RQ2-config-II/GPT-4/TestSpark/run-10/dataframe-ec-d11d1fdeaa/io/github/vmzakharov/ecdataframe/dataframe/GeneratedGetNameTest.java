package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        DataFrame df = new DataFrame("TestName");
        assertEquals("TestName", df.getName());
    }

}