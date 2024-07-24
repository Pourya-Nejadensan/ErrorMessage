package org.example.errormessage;

import java.time.LocalDateTime;

public record ErrorMessage(
        String message,
        LocalDateTime timeStamp
) {
}
