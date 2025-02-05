package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapWithSize.aMapWithSize;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithoutParameterTest {

    @Test
    public void ConstructorWithoutParameterTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        assertTrue(cc.getAllComments().isEmpty());
    }

}