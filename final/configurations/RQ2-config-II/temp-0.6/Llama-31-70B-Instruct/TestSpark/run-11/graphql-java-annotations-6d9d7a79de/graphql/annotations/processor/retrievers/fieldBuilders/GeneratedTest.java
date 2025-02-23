package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    private DirectivesBuilder builder;
    @Mock
    private AnnotatedElement object;
    @Mock
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        builder = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuild() {
        when(container.getDirectiveRegistry().containsKey("key")).thenReturn(true);
        builder.build();
    }

    @Test
    public void testTransformArgs() {
        when(container.getDirectiveRegistry().containsKey("key")).thenReturn(true);
        Annotation annotation = null;
        builder.transformArgs("key", annotation);
    }

    @Test
    public void testTransformArgs2() {
        when(container.getDirectiveRegistry().containsKey("key")).thenReturn(true);
        String[] argumentValues = null;
        builder.transformArgs("key", argumentValues);
    }

    @Test
    public void testTransformArgument() {
        when(container.getDirectiveRegistry().containsKey("key")).thenReturn(true);
        Annotation annotation = null;
        builder.transformArgument(annotation, null, null, 0);
    }

}