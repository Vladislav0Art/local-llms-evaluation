package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddDateColumnNewColumnNameTest {

    @Test
    public void addDateColumnNewColumnNameTest() {
        DataFrame df = new DataFrame("Test");
        df.addDateColumn("new_column");
        assertTrue(df.hasColumn("new_column"));
    }

}