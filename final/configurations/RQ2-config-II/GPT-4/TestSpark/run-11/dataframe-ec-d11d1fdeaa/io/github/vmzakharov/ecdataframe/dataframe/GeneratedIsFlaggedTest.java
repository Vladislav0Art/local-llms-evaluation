package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

public class GeneratedIsFlaggedTest {

    @Test
    public void isFlaggedTest() {
        DataFrame df = Mockito.spy(new DataFrame("Test"));
        df.setFlag(1);
        assertTrue(df.isFlagged(1));
    }

}