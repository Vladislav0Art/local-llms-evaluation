package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSealTest {

    @Test
    public void sealTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.seal();
        //Here you should check whether DataFrame's status has changed to sealed.
    }

}