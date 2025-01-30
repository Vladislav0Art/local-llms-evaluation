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

public class GeneratedBuildCallsGetAnnotationsTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private AnnotatedElement object;

    @Test
    public void buildCallsGetAnnotationsTest() {
        when(object.getAnnotations()).thenReturn(new Annotation[]{});
        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            builder.build();
        } catch (Exception ignore) {
        }
        MockitoAnnotations.verify(object).getAnnotations();
    }

}