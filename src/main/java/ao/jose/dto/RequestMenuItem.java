package ao.jose.dto;

import java.math.BigDecimal;

public record RequestMenuItem(String name, String category, String description, BigDecimal price) {
}
