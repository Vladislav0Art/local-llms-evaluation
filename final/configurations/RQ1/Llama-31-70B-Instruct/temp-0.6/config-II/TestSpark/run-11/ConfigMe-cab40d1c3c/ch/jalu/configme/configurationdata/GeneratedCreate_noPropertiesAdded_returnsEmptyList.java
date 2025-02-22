package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedCreate_noPropertiesAdded_returnsEmptyList {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_noPropertiesAdded_returnsEmptyList() {
        // act
        List<Property<?>> properties = propertyListBuilder.create();

        // assert
        assertTrue(properties.isEmpty());
    }

}