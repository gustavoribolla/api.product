package store.product;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record ProductOut(
    String id,
    String name,
    Double price,
    String unit
) implements Serializable {
    private static final long serialVersionUID = 1L;
}
