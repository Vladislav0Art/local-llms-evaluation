package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DataFrame dataframe = mock(DataFrame.class);
        when(dataframe.getColumns()).thenReturn(Arrays.asList("A", "B"));
        when(dataframe.values().get(0).get(0)).thenReturn("x");
        String actual = visitor.toString();
        assert actual.equals("A\nB\nx\n");
    }

}