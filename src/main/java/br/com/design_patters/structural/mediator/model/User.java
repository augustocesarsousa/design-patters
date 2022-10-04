package main.java.br.com.design_patters.structural.mediator.model;

import main.java.br.com.design_patters.structural.mediator.mediator.Mediator;

public abstract class User {

  protected final String name;
  protected final Language language;
  protected final Mediator mediator;

  public User(String name, Mediator mediator, Language language) {
    this.name = name;
    this.mediator = mediator;
    this.language = language;
  }

  public String getName() {
    return name;
  }

  public Language getLanguage() {
    return language;
  }

  public void sendMessage(String message) {
    this.sendMessage(message, null);
  }

  public void sendMessage(String message, User to) {
    String receiverName = to != null ? to.getName() : "ALL";
    System.out.println(
      String.format(
        "'%s' is sending the message '%s' to '%s'",
        name,
        message,
        receiverName
      )
    );
    mediator.sendMessage(message, to, this);
  }

  public void receiveMessage(String message, User from) {
    System.out.println(
      String.format(
        "'%s' has recieved the message '%s' from '%s'",
        name,
        message,
        from.getName()
      )
    );
  }
}
