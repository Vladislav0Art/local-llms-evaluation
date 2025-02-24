package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddTest_PropertyIsNull_ExpectConfigMeException {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addTest_PropertyIsNull_ExpectConfigMeException() {
        propertyListBuilder.add(null);
    }

}