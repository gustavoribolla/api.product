package store.product;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent=true)
public record ProductOut(
    private static final long serialVersionUID = 1L;
    String id,
    String name,
    Double price,
    String unit
) implements Serializable {
    private static final long serialVersionUID = 1L;
}
