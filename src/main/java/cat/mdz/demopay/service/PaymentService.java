package cat.mdz.demopay.service;

import cat.mdz.demopay.dto.PaymentRequest;
import cat.mdz.demopay.dto.PaymentResponse;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class PaymentService {

    public PaymentResponse authorize(PaymentRequest request) {
        // TODO: Validate limit and balance in Redis
        // TODO: Send event to Kafka

        return new PaymentResponse(
                UUID.randomUUID(),
                "APPROVED",
                "Transaction authorized successfully"
        );
    }
}