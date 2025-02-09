package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDirectivesBuilderNullAnnotatedElementTest {

    @Test
    public void DirectivesBuilderNullAnnotatedElementTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        new DirectivesBuilder(null, container);
    }

}