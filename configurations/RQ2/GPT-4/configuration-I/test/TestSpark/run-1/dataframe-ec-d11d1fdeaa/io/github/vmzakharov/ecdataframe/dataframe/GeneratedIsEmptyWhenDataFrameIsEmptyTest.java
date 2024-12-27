package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.collections.api.list.ListIterable;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import io.github.vmzakharov.ecdataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.DataFrame.DfColumn;

import java.util.Collections;

public class GeneratedIsEmptyWhenDataFrameIsEmptyTest {

    @Test
    public void isEmptyWhenDataFrameIsEmptyTest() {
        DataFrame dataFrame = new DataFrame("NewDataFrame");
        Assert.assertTrue(dataFrame.isEmpty());
    }

}