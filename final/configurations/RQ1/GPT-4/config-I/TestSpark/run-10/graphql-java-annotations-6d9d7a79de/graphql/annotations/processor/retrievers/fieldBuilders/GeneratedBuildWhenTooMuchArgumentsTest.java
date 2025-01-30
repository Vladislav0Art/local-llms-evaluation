package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.*;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedBuildWhenTooMuchArgumentsTest {

    @Test
    public void buildWhenTooMuchArgumentsTest() throws Exception {
        Field field = mock(Field.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Annotation annotation = mock(Directive.class);

        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new java.lang.reflect.Method[0]);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(field)).thenReturn(Arrays.stream(new Annotation[]{annotation}));

        GraphQLDirective directive = mock(GraphQLDirective.class);
        when(directive.getArguments()).thenReturn(Collections.emptyList());

        Map<String, graphql.schema.GraphQLDirective> directiveRegistry = new HashMap<>();
        directiveRegistry.put("mock", directive);

        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

}