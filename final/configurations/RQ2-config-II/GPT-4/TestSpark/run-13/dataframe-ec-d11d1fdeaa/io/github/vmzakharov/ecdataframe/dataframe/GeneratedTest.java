package io.github.vmzakharov.ecdataframe.dataframe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void rowDataFrameAddRowTest() {
        ListIterable<Value> rowValues = Mockito.mock(ListIterable.class);
        DataFrame dataFrame = new DataFrame("test");
        DataFrame returnedDataFrame = dataFrame.addRow(rowValues);
        MatcherAssert.assertThat(returnedDataFrame, Matchers.equalTo(dataFrame));
    }

    @Test
    public void getStringColumnTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        DfStringColumn stringColumn = dataFrame.getStringColumn("stringColumn");
        MatcherAssert.assertThat(stringColumn.getName(), Matchers.equalTo("stringColumn"));
    }

    @Test
    public void addColumnWithValueTypeTest() {
        DataFrame dataFrame = new DataFrame("test");
        ValueType type = ValueType.BOOLEAN;
        DataFrame returnedDataFrame = dataFrame.addColumn("columnName", type);
        MatcherAssert.assertThat(returnedDataFrame, Matchers.equalTo(dataFrame));
    }

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        int count = dataFrame.columnCount();
        MatcherAssert.assertThat(count, Matchers.equalTo(1));
    }

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        int rowCount = dataFrame.rowCount();
        MatcherAssert.assertThat(rowCount, Matchers.equalTo(1));
    }

    @Test
    public void asCsvStringTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        String csv = dataFrame.asCsvString();
        MatcherAssert.assertThat(csv, Matchers.not(Matchers.isEmptyOrNullString()));
    }

    @Test
    public void asCsvStringWithLimitTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        String csv = dataFrame.asCsvString(1);
        MatcherAssert.assertThat(csv, Matchers.not(Matchers.isEmptyOrNullString()));
    }

    @Test
    public void getAggregateIndexTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("stringColumn");
        dataFrame.addRow(Arrays.asList(new Value("value")));
        IntList aggregateIndex = dataFrame.getAggregateIndex(0);
        MatcherAssert.assertThat(aggregateIndex, Matchers.notNullValue());
    }

}