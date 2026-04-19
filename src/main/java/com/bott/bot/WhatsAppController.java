package com.bott.bot;

import org.springframework.web.bind.annotation.*;

@RestController
public class WhatsAppController {

    private final SolarService service = new SolarService();

    @PostMapping("/whatsapp")
    public String reply(@RequestParam("Body") String message) {

        message = message.toLowerCase();
        String response = service.processMessage(message);

        return "<Response><Message>" + response + "</Message></Response>";
    }
}
