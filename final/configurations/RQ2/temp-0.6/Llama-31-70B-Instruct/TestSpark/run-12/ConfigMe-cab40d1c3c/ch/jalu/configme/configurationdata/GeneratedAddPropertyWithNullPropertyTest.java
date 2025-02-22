package ch.jalu.configme.configurationdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedAddPropertyWithNullPropertyTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @After
    public void tearDown() {
        propertyListBuilder = null;
    }

    @Test
    public void addPropertyWithNullPropertyTest() {
        propertyListBuilder.add(null);
    }

}