package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddStringColumnValues {

    @Mock
    private EvalContext evalContext;

    @Test
    public void testAddStringColumnValues() {
        DataFrame dataFrame = new DataFrame("test");
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        dataFrame.addStringColumn("column1", values);
        assertNotNull(dataFrame.getColumnNamed("column1"));
    }

}