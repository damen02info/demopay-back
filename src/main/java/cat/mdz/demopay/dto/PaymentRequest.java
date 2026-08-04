package cat.mdz.demopay.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

public record PaymentRequest(
        @NotNull(message = "Card ID is mandatory")
        UUID cardId,

        @NotNull(message = "Amount is mandatory")
        @DecimalMin(value = "0.01", message = "Amount must be greater than zero")
        BigDecimal amount,

        @NotBlank(message = "Merchant is mandatory")
        String merchant,

        @NotNull(message = "Idempotency key is mandatory")
        UUID idempotencyKey
) {}