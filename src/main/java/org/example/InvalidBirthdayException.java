package org.example;

import java.text.ParseException;

public class InvalidBirthdayException extends Exception {
  // preserving the original exception object when wrapping
  // prerequisite: we need to get the original exception object in the constructor
  // which means we need to have at least one constructor which is accepting original exception object
  // 1. provide orig. ex. object to parents constructor
  // 2. call initCause method
  public InvalidBirthdayException(String message, ParseException cause) {
    super(message, cause);
  }

  public InvalidBirthdayException(ParseException cause) {
    super();
    super.initCause(cause);
  }
}
