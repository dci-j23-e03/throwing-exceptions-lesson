package org.example;

import java.io.IOException;
import java.time.LocalDateTime;

public class OurCustumException extends Exception {
  private LocalDateTime exceptionTime;

  public OurCustumException(String message) {
    super(message);
    exceptionTime = LocalDateTime.now();
  }

  public OurCustumException(String message, int counter) {
    super(message + counter);
    exceptionTime = LocalDateTime.now();
  }
}
