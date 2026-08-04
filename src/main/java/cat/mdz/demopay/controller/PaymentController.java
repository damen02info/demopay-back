package cat.mdz.demopay.controller;

import cat.mdz.demopay.dto.PaymentRequest;
import cat.mdz.demopay.dto.PaymentResponse;
import cat.mdz.demopay.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/authorize")
    public ResponseEntity authorize(@Valid @RequestBody PaymentRequest request) {
        PaymentResponse response = paymentService.authorize(request);
        return ResponseEntity.ok(response);
    }
}