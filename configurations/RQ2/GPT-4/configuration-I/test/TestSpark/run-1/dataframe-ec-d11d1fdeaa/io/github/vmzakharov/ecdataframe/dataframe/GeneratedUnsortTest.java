package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.api.list.ListIterable;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import io.github.vmzakharov.ecdataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.DataFrame.DfColumn;

import java.util.Collections;

public class GeneratedUnsortTest {

    @Test
    public void unsortTest() {
        DataFrame dataFrame = new DataFrame("NewDataFrame");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow("Data1");
        dataFrame.addRow("Data2");
        dataFrame.unsort();
        Assert.assertEquals("Data1", dataFrame.getString("Column1", 0));
        Assert.assertEquals("Data2", dataFrame.getString("Column1", 1));
    }

}