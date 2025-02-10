package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedAddMultiplePropertiesTest {

    @Mock
    private Property<?> propertyMock;

    public void setPropertyMock(Property<?> propertyMock) {
        this.propertyMock = propertyMock;
    }

    @org.junit.Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addMultiplePropertiesTest() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(propertyMock);
        MockProperty mockProperty = new MockProperty();
        properties.add(mockProperty);

        new PropertyListBuilder().addAll(properties);
        assertEquals(2, new PropertyListBuilder().create().size());
    }

}