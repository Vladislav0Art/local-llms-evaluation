package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestPrint {

    @Mock
    private PrintStream printStream = new PrintStream(System.out);

    @Test
    public void testPrint() {
        when(printStream.print(anyString())).thenReturn(0);
        System.setOut(printStream);
        //your code here
        System.setOut(System.out);
    }

}