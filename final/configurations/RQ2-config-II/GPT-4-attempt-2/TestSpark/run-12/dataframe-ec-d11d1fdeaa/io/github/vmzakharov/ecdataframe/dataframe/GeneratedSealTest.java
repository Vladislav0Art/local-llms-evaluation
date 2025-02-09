package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSealTest {

    @Test
    public void sealTest() {
        DataFrame df = new DataFrame("test");
        df.addStringColumn("Column1");
        df.addRow("String1");

        assertTrue(df.seal().isSealed());
    }

}