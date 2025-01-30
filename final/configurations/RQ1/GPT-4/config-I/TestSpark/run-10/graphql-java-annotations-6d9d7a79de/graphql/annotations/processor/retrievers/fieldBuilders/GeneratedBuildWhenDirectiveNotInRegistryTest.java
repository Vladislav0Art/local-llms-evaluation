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

public class GeneratedBuildWhenDirectiveNotInRegistryTest {

    @Test
    public void buildWhenDirectiveNotInRegistryTest() {
        Field field = mock(Field.class);
        Annotation annotation = mock(Directive.class);
        when(DirectiveJavaAnnotationUtil.getName(annotation)).thenReturn("nonexistent");
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(field)).thenReturn(Arrays.stream(new Annotation[]{annotation}));

        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Map<String, graphql.schema.GraphQLDirective> registry = new HashMap<>();
        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

}