package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCreateDataFrame {

    @Test
    public void testCreateDataFrame() {
        // Test creating a DataFrame with 3 columns and 4 rows
        DataFrame df = new DataFrame("Column1", "Column2", "Column3");
        assertEquals(3, df.getNumberOfColumns());
        assertEquals(4, df.getNumberOfRows());

        // Test accessing columns by name
        System.out.println(df.getColumn("Column1"));  // Output: Column1
        System.out.println(df.getColumn("Column2"));  // Output: Column2
        System.out.println(df.getColumn("Column3"));  // Output: Column3

        // Test accessing rows by index
        DataFrame dfCopy = (DataFrame) df.cloneStructure();
        assertEquals(4, dfCopy.getNumberOfRows());
        for (int i = 0; i < 4; i++) {
            System.out.println(dfCopy.getRow(i));
        }
    }

}