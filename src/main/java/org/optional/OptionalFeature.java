package org.optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalFeature {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Error cmnr") );
        System.out.println(value);

    }

}
