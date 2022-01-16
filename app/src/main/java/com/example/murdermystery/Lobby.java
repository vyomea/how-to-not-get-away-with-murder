package com.example.murdermystery;

import java.util.ArrayList;

public class Lobby {
    private String lobbyCode;
    private ArrayList<User> participants;
    private Map selectedMap;

    public Lobby(ArrayList<User> participants) {
        this.participants = participants;
        this.lobbyCode = "TODO";
        this.selectedMap = null;
    }

    public String getLobbyCode() {
        return lobbyCode;
    }

    public void setLobbyCode(String lobbyCode) {
        this.lobbyCode = lobbyCode;
    }

    public ArrayList<User> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<User> participants) {
        this.participants = participants;
    }

    public Map getSelectedMap() {
        return selectedMap;
    }

    public void setSelectedMap(Map selectedMap) {
        this.selectedMap = selectedMap;
    }
}
