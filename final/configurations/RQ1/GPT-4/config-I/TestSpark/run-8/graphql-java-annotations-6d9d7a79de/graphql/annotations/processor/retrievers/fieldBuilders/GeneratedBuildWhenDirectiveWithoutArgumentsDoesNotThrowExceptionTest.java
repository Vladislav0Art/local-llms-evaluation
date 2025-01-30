package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveAndWiring;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWhenDirectiveWithoutArgumentsDoesNotThrowExceptionTest {

    @Mock
    private ProcessingElementsContainer container;
    @Mock
    private AnnotatedElement object;
    @Mock
    private Directive directive;

    @Test
    public void buildWhenDirectiveWithoutArgumentsDoesNotThrowExceptionTest() {
        List<Annotation> annotations = new ArrayList<>();
        annotations.add(directive);

        DirectiveAndWiring directiveAndWiring = new DirectiveAndWiring();
        directiveAndWiring.setDirective(GraphQLDirective.newDirective().name("test").build());
        Map<String, DirectiveAndWiring> directiveRegistry = new HashMap<>();
        directiveRegistry.put("test", directiveAndWiring);

        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        when(object.getAnnotations()).thenReturn(annotations.toArray(new Annotation[0]));

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build(); // should not throw exception
    }

    @Directive(name = "test", argumentsValues = {"test"})
    @interface TestDirective {
        String test();
    }

}