package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildErrorOnGettingDirectivesTest {

    @Mock
    private Method annotatedElement;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildErrorOnGettingDirectivesTest() {
        when(annotatedElement.getAnnotations()).thenThrow(new RuntimeException());

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        directivesBuilder.build();
    }

}