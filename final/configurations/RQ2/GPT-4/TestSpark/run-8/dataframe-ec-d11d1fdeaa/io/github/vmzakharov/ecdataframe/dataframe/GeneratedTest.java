package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addStringColumn("Test_Column");
        assertEquals("Test_Column", dataFrame.getColumnNamed("Test_Column").getName());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addLongColumn("Test_Column", LongLists.mutable.of(1L, 2L, 3L));
        assertEquals("Test_Column", dataFrame.getColumnNamed("Test_Column").getName());
    }

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addDateColumn("Test_Column", Lists.mutable.of(LocalDate.now(), LocalDate.now()));
        assertEquals("Test_Column", dataFrame.getColumnNamed("Test_Column").getName());
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addRow(Lists.mutable.of(new StringValue("1"), new StringValue("test")));
        assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addStringColumn("Column1");
        dataFrame.addLongColumn("Column2", LongLists.mutable.of(1L, 2L, 3L));
        assertEquals(2, dataFrame.columnCount());
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("testing");
        assertEquals("testing", dataFrame.getName());
    }

    @Test
    public void isFlaggedTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addRow(Lists.mutable.of(new StringValue("1"), new StringValue("test")));
        dataFrame.setFlag(0);
        assertTrue(dataFrame.isFlagged(0));
    }

    @Test
    public void notFlaggedTest() {
        DataFrame dataFrame = new DataFrame("testing");
        assertFalse(dataFrame.isFlagged(0));
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addRow("1", "test");
        assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void getStringTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addStringColumn("Test_Column");
        dataFrame.addRow("1", "test");
        assertEquals("test", dataFrame.getString("Test_Column", 0));
    }

}