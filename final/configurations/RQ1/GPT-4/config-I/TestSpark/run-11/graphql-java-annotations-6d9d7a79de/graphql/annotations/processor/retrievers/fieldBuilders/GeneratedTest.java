package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;

public class GeneratedTest {

    @Test
    public void buildNoDirectiveFoundTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Annotation.class);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(Map.of());
        Mockito.when(object.getDeclaredAnnotations()).thenReturn(new Annotation[]{annotation});

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

    @Test
    public void buildNoDirectiveFoundInRegistryTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}