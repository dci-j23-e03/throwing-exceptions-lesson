package org.example;

import java.text.ParseException;

public class InvalidBirthdayException extends Exception {
  public InvalidBirthdayException(String message, ParseException cause) {
    super(message, cause);
  }

  public InvalidBirthdayException(ParseException cause) {
    super();
    super.initCause(cause);
  }
}
