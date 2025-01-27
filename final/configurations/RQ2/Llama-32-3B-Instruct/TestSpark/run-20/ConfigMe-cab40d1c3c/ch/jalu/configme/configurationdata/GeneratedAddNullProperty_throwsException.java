package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddNullProperty_throwsException {

    @Mock
    private List<Property<?>> properties;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addNullProperty_throwsException() {
        when(properties).thenReturn(new ArrayList<>());
        try {
            propertyListBuilder.add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals(ConfigMeException.class, e.getClass());
        }
    }

}