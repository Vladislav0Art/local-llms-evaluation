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

public class GeneratedAddStringColumnAddMultipleColumnsTest {

    @Test
    public void addStringColumnAddMultipleColumnsTest() {
        DataFrame dataFrame = new DataFrame("NewDataFrame");
        dataFrame.addStringColumn("Column1");
        dataFrame.addStringColumn("Column2");
        Assert.assertTrue(dataFrame.hasColumn("Column1"));
        Assert.assertTrue(dataFrame.hasColumn("Column2"));
    }

}