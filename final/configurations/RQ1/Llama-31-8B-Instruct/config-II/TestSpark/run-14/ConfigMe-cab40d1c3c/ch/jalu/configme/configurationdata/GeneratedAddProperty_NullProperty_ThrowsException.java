package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.exception.ConfigMeException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_NullProperty_ThrowsException {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_NullProperty_ThrowsException() {
        assertThrows(NullPointerException.class, () -> builder.add(null));
    }

}