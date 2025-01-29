package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestProcedure {

    @Test
    public void testProcedure() {
        // Test calling a procedure on a DataFrame
        DataFrame df = new DataFrame("ColumnA", "ColumnB");

        Procedure<DfCursor> action = (procedure, data) -> {
            System.out.println(data.getColumn("ColumnA"));
            return null;
        };

        assertEquals(3, df.getNumberOfColumns());
        assertEquals(4, df.getNumberOfRows());

        String result = procedure.call(df, new DfCursor());
        System.out.println(result);
    }

}