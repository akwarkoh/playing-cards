package com.tlglearning.cards.model;

import java.nio.file.attribute.PosixFileAttributes;

public enum Rank {
  ACE("Ace"),
  ONE("One"),
  TWO("Two"),
  THREE("Three"),
  FOUR("Four"),
  FIVE("Five"),
  SIX ("Six"),
  SEVEN("Seven"),
  EIGHT("Eight"),
  NINE("Nine"),
  TEN("Ten"),
  JACK("Jack"),
  QUEEN("Queen"),
  KING("King");

  private final String symbol;

  Rank(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }

}



