package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.mockito.MockitoAnnotations;

public class GeneratedTransformArgsFailToParseArgumentValueTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private AnnotatedElement object;

    @Test
    public void transformArgsFailToParseArgumentValueTest() {
        Map<String, List<GraphQLArgument>> directiveRegistry = new HashMap<>();
        GraphQLArgument argument = GraphQLArgument.newArgument()
                .type(GraphQLScalarType.newScalar().build())
                .build();
        directiveRegistry.put("test", Collections.singletonList(argument));
        Annotation annotation = new Annotation() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return Annotation.class;
            }
        };
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        assertThrows(GraphQLAnnotationsException.class, () -> builder.transformArgs(
                GraphQLDirective.newDirective().name("test").build(),
                annotation
        ));
    }

}