package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedJoinWithNonExistentColumnNameTest {

    @Test
    public void joinWithNonExistentColumnNameTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addLongColumn("TestColumnName", LongLists.mutable.of(1L, 2L, 3L));
        DataFrame df2 = new DataFrame("TestFrame2");
        df2.addLongColumn("TestColumnName", LongLists.mutable.of(3L, 4L, 5L));
        df1.join(df2, Lists.mutable.of("NonExistentColumnName"), Lists.mutable.of("TestColumnName"));
    }

}