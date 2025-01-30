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
public class GeneratedBuildProperlyInteractsWithMocksTest {

    @Mock
    private ProcessingElementsContainer container;
    @Mock
    private AnnotatedElement object;
    @Mock
    private Directive directive;

    @Test
    public void buildProperlyInteractsWithMocksTest() {
        List<Annotation> annotations = new ArrayList<>();
        annotations.add(directive);

        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());
        when(object.getAnnotations()).thenReturn(annotations.toArray(new Annotation[0]));

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            builder.build();
        } catch (Exception ignore) {
        }

        Mockito.verify(object).getAnnotations();
        Mockito.verify(container).getDirectiveRegistry();
    }

}