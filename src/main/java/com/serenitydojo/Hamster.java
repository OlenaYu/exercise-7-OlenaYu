package com.serenitydojo;

    public class Hamster extends Pet {
    private String favoriteGame;
    public String getFavoriteGame() {
        return favoriteGame;
    }
    public Hamster(String name, int age, String favoriteGame) {
        super(name, age);
        this.favoriteGame = favoriteGame;
        }

        @Override
        public String play() {
        return "runs in wheel";
        }
    }

