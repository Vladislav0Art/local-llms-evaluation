package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyTest {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addPropertyTest() {
        Property<String> property = mock(Property.class, Mockito.CALLS_REAL_METHODS);
        when(property.setParent(any())).thenAnswer(invocation -> invocation.getArgument(0));
        builder.add(property);
        verify(property).setParent(builder);
    }

}