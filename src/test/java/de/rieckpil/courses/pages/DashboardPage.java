package de.rieckpil.courses.pages;

import com.codeborne.selenide.Selenide;

public class DashboardPage {
  public DashboardPage open() {
    Selenide.open("/index.html");
    return this;
  }
}
