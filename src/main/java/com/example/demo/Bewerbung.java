package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Bewerbung {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate abgabe;

    private String titel;

    public Bewerbung() {

    }

    public Bewerbung(LocalDate abgabe, String titel) {
        this.abgabe = abgabe;
        this.titel = titel;
    }

    public LocalDate getAbgabe() {
        return abgabe;
    }

    public void setAbgabe(LocalDate abgabe) {
        this.abgabe = abgabe;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
