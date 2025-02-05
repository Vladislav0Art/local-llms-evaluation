package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.eclipse.collections.impl.map.mutable.primitive.LongLongHashMap;
import org.eclipse.collections.impl.map.mutable.primitive.ObjectLongHashMap;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class GeneratedDropIndexTest {

    @Test
    public void dropIndexTest() {
        DataFrame df = new DataFrame("testDf");
        df.addLongColumn("values", IntLists.mutable.of(1, 2, 3));
        df.createIndex("index1", FastList.newListWith("values"));
        df.dropIndex("index1");
        Assert.assertNull(df.index("index1"));
    }

}