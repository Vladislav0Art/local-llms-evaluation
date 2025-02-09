package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.ByteStringColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSealsAndCloneTest {

    @Test
    public void sealsAndCloneTest() {
        DataFrame df = new DataFrame("DataFrame10");
        df.addStringColumn("Column1");
        df.addRow("John Doe");
        DataFrame copy = df.copy("Copy of DataFrame");
        copy.isSealed();
    }

}