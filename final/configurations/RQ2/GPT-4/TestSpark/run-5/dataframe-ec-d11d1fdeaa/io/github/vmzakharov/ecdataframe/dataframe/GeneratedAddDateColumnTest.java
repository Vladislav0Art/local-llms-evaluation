package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.*;

public class GeneratedAddDateColumnTest {

    @Test
    public void AddDateColumnTest() {
        List<LocalDate> localDateList = new ArrayList<>();
        localDateList.add(LocalDate.now());
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDateColumn("TestColumn", Lists.immutable.ofAll(localDateList));
        assertEquals(1, dataFrame.columnCount());
    }

}