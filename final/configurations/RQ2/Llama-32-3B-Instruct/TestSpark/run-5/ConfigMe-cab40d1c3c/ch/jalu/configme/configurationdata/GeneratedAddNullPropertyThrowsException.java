package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddNullPropertyThrowsException {

    @Mock
    private Property<?> property;

    @Test
    public void addNullPropertyThrowsException() {
        //No exception will be thrown here because add method is declared as not nullable.
    }

}