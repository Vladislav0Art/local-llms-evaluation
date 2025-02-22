package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class GeneratedCreate_emptyList_listIsCreated {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void create_emptyList_listIsCreated() throws Exception {
        assertEquals(0, propertyListBuilder.create().size());
    }

}