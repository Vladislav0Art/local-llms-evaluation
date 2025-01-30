package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedBuildWithExistingRegistryKeyTest {

    @Test
    public void buildWithExistingRegistryKeyTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Map<String, GraphQLDirective> directiveRegistry = new HashMap<>();
        directiveRegistry.put("testDirective", Mockito.mock(GraphQLDirective.class));
        Mockito.when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);

        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        assertNotNull(result);
    }

}