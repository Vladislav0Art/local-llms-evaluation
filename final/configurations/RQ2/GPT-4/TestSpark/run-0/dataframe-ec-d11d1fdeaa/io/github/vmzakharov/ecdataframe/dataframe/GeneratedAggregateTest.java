package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.dataframe.AggregateFunction;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAggregateTest {

    @Test
    public void aggregateTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        df.addRow(10L);
        ListIterable<AggregateFunction> functions = FastList.newList();
        // TODO: add aggregate function instances to the 'functions' list based your requirements.
        DataFrame aggregateDf = df.aggregate(functions);
        assertNotNull(aggregateDf);
    }

}