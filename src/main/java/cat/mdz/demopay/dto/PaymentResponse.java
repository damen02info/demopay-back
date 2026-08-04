package cat.mdz.demopay.dto;

import java.util.UUID;

public record PaymentResponse(
        UUID transactionId,
        String status,
        String reason
) {}